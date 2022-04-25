package com.MiguelAngelSotelo.backendArgentinaPrograma.security.repository;

import com.MiguelAngelSotelo.backendArgentinaPrograma.security.entity.Role;
import com.MiguelAngelSotelo.backendArgentinaPrograma.security.enums.RoleNombre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRoleNombre(RoleNombre roleNombre);
}
