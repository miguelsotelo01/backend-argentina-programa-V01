package com.MiguelAngelSotelo.backendArgentinaPrograma.dto;

public class ExperienciaLaboralDto {
    private String puesto;
    private String nombreEmpresa;
    private String Inicio;
    private String Finalizacion;
    private String descripcion;

    public ExperienciaLaboralDto() {
    }

    public ExperienciaLaboralDto(String puesto, String nombreEmpresa, String inicio, String finalizacion, String descripcion) {
        this.puesto = puesto;
        this.nombreEmpresa = nombreEmpresa;
        Inicio = inicio;
        Finalizacion = finalizacion;
        this.descripcion = descripcion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getInicio() {
        return Inicio;
    }

    public void setInicio(String inicio) {
        Inicio = inicio;
    }

    public String getFinalizacion() {
        return Finalizacion;
    }

    public void setFinalizacion(String finalizacion) {
        Finalizacion = finalizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
