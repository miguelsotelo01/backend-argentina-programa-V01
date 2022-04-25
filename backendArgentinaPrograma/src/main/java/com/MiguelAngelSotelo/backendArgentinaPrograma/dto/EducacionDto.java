package com.MiguelAngelSotelo.backendArgentinaPrograma.dto;

public class EducacionDto {
    private String tituloEstudios;
    private String Institucion;
    private String Inicio;
    private String Finalizacion;
    private String urlLogo;

    public EducacionDto() {
    }

    public EducacionDto(String tituloEstudios, String institucion, String inicio, String finalizacion, String urlLogo) {
        this.tituloEstudios = tituloEstudios;
        Institucion = institucion;
        Inicio = inicio;
        Finalizacion = finalizacion;
        this.urlLogo = urlLogo;
    }

    public String getTituloEstudios() {
        return tituloEstudios;
    }

    public void setTituloEstudios(String tituloEstudios) {
        this.tituloEstudios = tituloEstudios;
    }

    public String getInstitucion() {
        return Institucion;
    }

    public void setInstitucion(String institucion) {
        Institucion = institucion;
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

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }
}
