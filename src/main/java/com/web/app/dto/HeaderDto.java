package com.web.app.dto;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;

public class HeaderDto implements Serializable{
    
    @NotBlank
    private String img_banner;
    @NotBlank
    private String img_perfil;
    @NotBlank
    private String img_logo;
    @NotBlank
    private String nombre;
    @NotBlank
    private String posicion;
    @NotBlank
    private String puesto;

    public HeaderDto() {
    }

    public HeaderDto(String img_banner, String img_perfil, String img_logo, String nombre, String posicion, String puesto) {
        this.img_banner = img_banner;
        this.img_perfil = img_perfil;
        this.img_logo = img_logo;
        this.nombre = nombre;
        this.posicion = posicion;
        this.puesto = puesto;
    }

    public String getImg_banner() {
        return img_banner;
    }

    public void setImg_banner(String img_banner) {
        this.img_banner = img_banner;
    }

    public String getImg_perfil() {
        return img_perfil;
    }

    public void setImg_perfil(String img_perfil) {
        this.img_perfil = img_perfil;
    }

    public String getImg_logo() {
        return img_logo;
    }

    public void setImg_logo(String img_logo) {
        this.img_logo = img_logo;
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    
}