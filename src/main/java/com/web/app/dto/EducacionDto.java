package com.web.app.dto;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;

public class EducacionDto implements Serializable{
    
    @NotBlank
    private String logo_img;
    @NotBlank
    private String institucion;
    @NotBlank
    private String titulo;
    @NotBlank
    private String periodo;

    public EducacionDto() {
    }

    public EducacionDto(String logo_img, String institucion, String titulo, String periodo) {
        this.logo_img = logo_img;
        this.institucion = institucion;
        this.titulo = titulo;
        this.periodo = periodo;
    }

    public String getLogo_img() {
        return logo_img;
    }

    public void setLogo_img(String logo_img) {
        this.logo_img = logo_img;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
   
}