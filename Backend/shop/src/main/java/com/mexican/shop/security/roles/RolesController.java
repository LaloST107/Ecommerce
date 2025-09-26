package com.mexican.shop.security.roles;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/roles")
public class RolesController {

    private final RolesService rolService;

    public RolesController(RolesService rolService) {
        this.rolService = rolService;
    }

    // Crear rol
    @PostMapping("/crear")
    public ResponseEntity<RolesEntity> crearRol(@RequestBody RolesEntity rolEntity) {
        RolesEntity nuevoRol = rolService.crearRol(rolEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoRol);
    }

    // Listar roles
    @GetMapping("/listar")
    public ResponseEntity<List<RolesEntity>> listarRoles() {
        return ResponseEntity.ok(rolService.listarRoles());
    }

    // Obtener rol por id
    @GetMapping("/{id}")
    public ResponseEntity<RolesEntity> obtenerRolPorId(@PathVariable Integer id) {
        return ResponseEntity.ok(rolService.obtenerRolPorId(id));
    }

}
