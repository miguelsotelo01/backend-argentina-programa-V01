package com.MiguelAngelSotelo.backendArgentinaPrograma.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
@Getter
@Setter
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private String apellido;
    private String ocupacion;
    private String telefono;
    private String email;
    private String acercaDe;
    private String urlImagen;
    private String bannerImagen;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, String ocupacion, String telefono, String email, String acercaDe, String urlImagen, String bannerImagen) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.telefono = telefono;
        this.email = email;
        this.acercaDe = acercaDe;
        this.urlImagen = urlImagen;
        this.bannerImagen = bannerImagen;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", acercaDe='" + acercaDe + '\'' +
                ", urlImagen='" + urlImagen + '\'' +
                ", bannerImagen='" + bannerImagen + '\'' +
                '}';
    }
}
