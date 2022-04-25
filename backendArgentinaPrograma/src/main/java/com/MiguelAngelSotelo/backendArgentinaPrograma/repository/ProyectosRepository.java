package com.MiguelAngelSotelo.backendArgentinaPrograma.repository;

import com.MiguelAngelSotelo.backendArgentinaPrograma.entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Long> {
    void deleteProyectoById(Long id);

    Optional<Proyectos> findProyectoById(Long id);
}
