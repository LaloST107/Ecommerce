//package com.mexican.shop.usuario;
//
//import com.mexican.shop.usuario.Records.UsarioRecordResponse;
//import com.mexican.shop.usuario.Records.UsuarioRecordRequest;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UsuarioService {
//
//    private final UsuarioRepository usuarioRepository;
//
//    public UsuarioService(UsuarioRepository usuarioRepository){
//        this.usuarioRepository = usuarioRepository;
//    }
//
//    public UsarioRecordResponse createUsuario(UsuarioRecordRequest usuarioRecordRequest){
//
//        UsuarioEntity usuarioEntity = new UsuarioEntity();
//
//        usuarioEntity.setNombreUsuarios(usuarioRecordRequest.nombreUsuario());
//        usuarioEntity.setApellidoPaterno(usuarioRecordRequest.apePat());
//        usuarioEntity.setApellidoMaterno(usuarioRecordRequest.apeMat());
//
//        usuarioRepository.save(usuarioEntity);
//
//        return new UsarioRecordResponse(
//                usuarioEntity.getNombreUsuarios(),
//                usuarioEntity.getApellidoPaterno()
//        );
//    }
//
//}
