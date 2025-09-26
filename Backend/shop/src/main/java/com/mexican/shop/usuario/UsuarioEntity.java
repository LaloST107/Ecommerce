package com.mexican.shop.usuario;

import jakarta.persistence.*;
import lombok.Data;
import com.mexican.shop.security.roles.RolesEntity;


@Data
@Entity
@Table(name = "TBL_USUARIOS")
public class UsuarioEntity {

    @Id
    @SequenceGenerator(name = "seqUsuarios", sequenceName = "SEQ_ID_USUARIO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqUsuarios")
    @Column(name = "idUsuario")
    private Integer idUsuario;

    @Column(name = "nombre_usuario", nullable = false, unique = true, length = 50)
    private String nombreUsuario;

    @Column(name = "correo", nullable = false, unique = true, length = 100)
    private String correo;

    @Column(name = "contraseña", nullable = false, length = 255)
    private String contrasena;

    @Column(name = "ap_paterno", length = 50)
    private String apPaterno;

    @Column(name = "ap_materno", length = 50)
    private String apMaterno;

    @Column(name = "activo", nullable = false, length = 50)
    private String activo;

    @Column(name = "fecha_creacion", insertable = false, updatable = false)
    private java.sql.Timestamp fechaCreacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idRoles", nullable = false)
    private RolesEntity rol;
}
