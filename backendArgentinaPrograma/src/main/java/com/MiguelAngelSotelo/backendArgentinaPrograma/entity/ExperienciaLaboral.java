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
public class ExperienciaLaboral implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String puesto;
    private String nombreEmpresa;
    private String Inicio;
    private String Finalizacion;
    private String descripcion;

    public ExperienciaLaboral() {
    }

    public ExperienciaLaboral(Long id, String puesto, String nombreEmpresa, String inicio, String finalizacion, String descripcion) {
        this.id = id;
        this.puesto = puesto;
        this.nombreEmpresa = nombreEmpresa;
        Inicio = inicio;
        Finalizacion = finalizacion;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "ExperienciaLaboral{" +
                "id=" + id +
                ", puesto='" + puesto + '\'' +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", Inicio='" + Inicio + '\'' +
                ", Finalizacion='" + Finalizacion + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
