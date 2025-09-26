package com.mexican.shop.security.roles;

import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name = "TBL_ROLES")
public class RolesEntity {

    @Id
    @SequenceGenerator(name = "seqRoles", sequenceName = "SEQ_ID_ROLES", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqRoles")
    @Column(name = "idRoles")
    private Integer idRoles;

    @Column(name = "nombre", nullable = false, unique = true, length = 50)
    private String nombre;

    @Column(name = "descripcion", length = 255)
    private String descripcion;

}
