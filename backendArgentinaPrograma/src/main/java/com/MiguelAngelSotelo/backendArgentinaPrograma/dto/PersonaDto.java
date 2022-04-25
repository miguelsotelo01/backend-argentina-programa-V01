package com.MiguelAngelSotelo.backendArgentinaPrograma.dto;

public class PersonaDto {
    private String nombre;
    private String apellido;
    private String ocupacion;
    private String telefono;
    private String email;
    private String acercaDe;
    private String urlImagen;
    private String bannerImagen;

    public PersonaDto() {
    }

    public PersonaDto(String nombre, String apellido, String ocupacion, String telefono, String email, String acercaDe, String urlImagen, String bannerImagen) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.telefono = telefono;
        this.email = email;
        this.acercaDe = acercaDe;
        this.urlImagen = urlImagen;
        this.bannerImagen = bannerImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAcercaDe() {
        return acercaDe;
    }

    public void setAcercaDe(String acercaDe) {
        this.acercaDe = acercaDe;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getBannerImagen() {
        return bannerImagen;
    }

    public void setBannerImagen(String bannerImagen) {
        this.bannerImagen = bannerImagen;
    }
}
