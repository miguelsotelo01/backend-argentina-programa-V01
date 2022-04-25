package com.MiguelAngelSotelo.backendArgentinaPrograma.service;

import com.MiguelAngelSotelo.backendArgentinaPrograma.entity.Educacion;
import com.MiguelAngelSotelo.backendArgentinaPrograma.exception.UserNotFoundException;
import com.MiguelAngelSotelo.backendArgentinaPrograma.repository.EducacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepository educacionRepo;

    @Autowired
    public EducacionService(EducacionRepository educacionRepoRepo) {
        this.educacionRepo = educacionRepoRepo;
    }

    public Educacion addEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public List<Educacion> findAllEducacion() {
        return educacionRepo.findAll();
    }

    public Educacion updateEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }

    public void deleteEducacion(Long id) { educacionRepo.deleteEducacionById(id); }

    public Educacion findEducacionById(Long id) {
        return educacionRepo.findEducacionById(id).orElseThrow(() -> new UserNotFoundException("El curso de id" + id + "no fue encontrado"));
    }
}
