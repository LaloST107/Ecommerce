//package com.mexican.shop.usuario;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Data
//@Entity
//@Table(name = "TBL_USUARIOS")
//public class UsuarioEntity {
//
//    @Id
//    @SequenceGenerator(name = "seqUsuarios", sequenceName = "SEQ_ID_USUARIOS", allocationSize = 1)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUsuarios")
//    @Column(name = "id")
//    private Integer idUsuario;
//
//    @Column(name = "NOMBRE_USUARIOS")
//    private String nombreUsuarios;
//
//    @Column(name = "APELLIDO_PATERNO")
//    private String apellidoPaterno;
//
//    @Column(name = "APELLIDO_MATERNO")
//    private String apellidoMaterno;
//}
