package com.mexican.shop.security.roles;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RolesService {

    private final RolesRepository rolesRepository;

    public RolesService(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    public RolesEntity crearRol(RolesEntity rolesEntity) {
        return rolesRepository.save(rolesEntity);
    }

    public List<RolesEntity> listarRoles() {
        return rolesRepository.findAll();
    }

    public RolesEntity obtenerRolPorId(Integer id) {
        return rolesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Rol no encontrado con id: " + id));
    }
}
