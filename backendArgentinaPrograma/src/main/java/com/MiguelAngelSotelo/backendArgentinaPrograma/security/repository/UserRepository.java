package com.MiguelAngelSotelo.backendArgentinaPrograma.security.repository;

import com.MiguelAngelSotelo.backendArgentinaPrograma.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByNombreUsuario(String nombreUsuario);
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);
}
