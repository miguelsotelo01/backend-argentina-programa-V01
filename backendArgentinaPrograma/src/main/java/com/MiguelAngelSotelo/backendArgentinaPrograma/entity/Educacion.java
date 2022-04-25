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
public class Educacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tituloEstudios;
    private String Institucion;
    private String Inicio;
    private String Finalizacion;
    private String urlLogo;

    public Educacion() {
    }

    public Educacion(Long id, String tituloEstudios, String institucion, String inicio, String finalizacion, String urlLogo) {
        this.id = id;
        this.tituloEstudios = tituloEstudios;
        Institucion = institucion;
        Inicio = inicio;
        Finalizacion = finalizacion;
        this.urlLogo = urlLogo;
    }

    @Override
    public String toString() {
        return "Educacion{" +
                "id=" + id +
                ", tituloEstudios='" + tituloEstudios + '\'' +
                ", Institucion='" + Institucion + '\'' +
                ", Inicio='" + Inicio + '\'' +
                ", Finalizacion='" + Finalizacion + '\'' +
                ", urlLogo='" + urlLogo + '\'' +
                '}';
    }
}
