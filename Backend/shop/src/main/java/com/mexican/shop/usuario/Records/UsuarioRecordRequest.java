package com.mexican.shop.usuario.Records;

public record UsuarioRecordRequest(
        String nombreUsuario,
        String correo,
        String contrasena,
        String apPaterno,
        String apMaterno,
        String activo,
        Integer idRol
) {}