package com.mexican.shop.usuario;

import com.mexican.shop.security.roles.RolesEntity;
import com.mexican.shop.security.roles.RolesRepository;
import com.mexican.shop.usuario.Records.UsarioRecordResponse;
import com.mexican.shop.usuario.Records.UsuarioRecordRequest;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final RolesRepository rolRepository;

    public UsuarioService(UsuarioRepository usuarioRepository, RolesRepository rolRepository){
        this.usuarioRepository = usuarioRepository;
        this.rolRepository = rolRepository;
    }

    public UsarioRecordResponse createUsuario(UsuarioRecordRequest usuarioRecordRequest){

        // Buscamos el rol por ID
        RolesEntity rol = rolRepository.findById(usuarioRecordRequest.idRol())
                .orElseThrow(() -> new RuntimeException("Rol no encontrado con id: " + usuarioRecordRequest.idRol()));

        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setNombreUsuario(usuarioRecordRequest.nombreUsuario());
        usuarioEntity.setCorreo(usuarioRecordRequest.correo());
        usuarioEntity.setContrasena(usuarioRecordRequest.contrasena());
        usuarioEntity.setApPaterno(usuarioRecordRequest.apPaterno());
        usuarioEntity.setApMaterno(usuarioRecordRequest.apMaterno());
        usuarioEntity.setActivo(usuarioRecordRequest.activo());
        usuarioEntity.setRol(rol);

        usuarioRepository.save(usuarioEntity);

        return new UsarioRecordResponse(
                usuarioEntity.getNombreUsuario(),
                usuarioEntity.getCorreo(),
                usuarioEntity.getRol().getNombre()
        );
    }
}
