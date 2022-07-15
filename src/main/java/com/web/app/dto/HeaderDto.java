package com.web.app.dto;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;

public class HeaderDto implements Serializable{
    
    @NotBlank
    private String img_banner;
    @NotBlank
    private String perfil;
    @NotBlank
    private String img_perfil;
    @NotBlank
    private String nombre;
    @NotBlank
    private String posicion;
    @NotBlank
    private String titulo;

    public HeaderDto() {
    }

    public HeaderDto( String img_banner, String perfil, String img_perfil, String nombre, String posicion, String titulo) {
        
        this.img_banner = img_banner;
        this.perfil = perfil;
        this.img_perfil = img_perfil;
        this.nombre = nombre;
        this.posicion = posicion;
        this.titulo = titulo;
    }

    public String getImg_banner() {
        return img_banner;
    }

    public void setImg_banner(String img_banner) {
        this.img_banner = img_banner;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getImg_perfil() {
        return img_perfil;
    }

    public void setImg_perfil(String img_perfil) {
        this.img_perfil = img_perfil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}