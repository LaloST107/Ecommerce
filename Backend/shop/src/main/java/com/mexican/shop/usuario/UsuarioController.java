//package com.mexican.shop.usuario;
//
//import com.mexican.shop.usuario.Records.UsarioRecordResponse;
//import com.mexican.shop.usuario.Records.UsuarioRecordRequest;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/usuarios")
//public class UsuarioController {
//
//    private final UsuarioService usuarioService;
//
//    public UsuarioController(UsuarioService usuarioService) {
//        this.usuarioService = usuarioService;
//    }
//
//    @PostMapping("crear-usuario")
//    public ResponseEntity<UsarioRecordResponse> createUsuario(@RequestBody UsuarioRecordRequest usuarioRecordRequest){
//
//        UsarioRecordResponse usarioRecordResponse = usuarioService.createUsuario(usuarioRecordRequest);
//        return ResponseEntity.status(HttpStatus.CREATED).body(usarioRecordResponse);
//
//    }
//}
