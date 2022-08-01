package com.web.app.dto;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;

public class EducacionDto implements Serializable{
    
    @NotBlank
    private String institucion;
    @NotBlank
    private String logo_img;
    @NotBlank
    private String periodo;
    @NotBlank
    private String titulo;

    public EducacionDto() {
    }

    public EducacionDto(String institucion, String logo_img, String periodo, String titulo) {
        this.institucion = institucion;
        this.logo_img = logo_img;
        this.periodo = periodo;
        this.titulo = titulo;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getLogo_img() {
        return logo_img;
    }

    public void setLogo_img(String logo_img) {
        this.logo_img = logo_img;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}