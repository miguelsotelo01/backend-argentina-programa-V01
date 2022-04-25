package com.MiguelAngelSotelo.backendArgentinaPrograma.repository;

import com.MiguelAngelSotelo.backendArgentinaPrograma.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Long> {
    void deleteEducacionById(Long id);
    Optional<Educacion> findEducacionById(Long id);
}