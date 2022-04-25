package com.MiguelAngelSotelo.backendArgentinaPrograma.security.service;

import com.MiguelAngelSotelo.backendArgentinaPrograma.security.entity.Role;
import com.MiguelAngelSotelo.backendArgentinaPrograma.security.enums.RoleNombre;
import com.MiguelAngelSotelo.backendArgentinaPrograma.security.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RoleService {
    @Autowired
    RoleRepository roleRepository;

    public Optional<Role> getByRoleNombre(RoleNombre rolenombre){
        return roleRepository.findByRoleNombre(rolenombre);
    }

    public void save(Role role){
        roleRepository.save(role);
    }
}
