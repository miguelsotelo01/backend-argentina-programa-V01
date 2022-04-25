package com.MiguelAngelSotelo.backendArgentinaPrograma.controller;

import com.MiguelAngelSotelo.backendArgentinaPrograma.entity.Educacion;
import com.MiguelAngelSotelo.backendArgentinaPrograma.service.EducacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/educacion")
public class EducacionController {
    @Autowired
    EducacionService educacionService;
    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> getAllEducacion() {
        List<Educacion> educacion = educacionService.findAllEducacion();
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Educacion> getEducacionById(@PathVariable("id") Long id) {
        Educacion educacion = educacionService.findEducacionById(id);
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @PostMapping("/add")
    public ResponseEntity<Educacion> addEducacion (@RequestBody Educacion educacion) {
        Educacion newEducacion = educacionService.addEducacion(educacion);
        return new ResponseEntity<>(newEducacion, HttpStatus.CREATED);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @PutMapping("/update")
    public ResponseEntity<Educacion> updateEducacion (@RequestBody Educacion educacion) {
        Educacion updateEducacion = educacionService.updateEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }

    /* @PreAuthorize("hasRole('ADMIN')")*/
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducacion (@PathVariable("id") Long id) {
        educacionService.deleteEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
