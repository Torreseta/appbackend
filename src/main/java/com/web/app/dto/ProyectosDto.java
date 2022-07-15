package com.web.app.dto;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;

public class ProyectosDto implements Serializable{

    @NotBlank
    private String nombre;
    @NotBlank
    private String img;
    @NotBlank
    private String fecha_realizacion;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String link;

    public ProyectosDto() {
    }

    public ProyectosDto(String nombre, String img, String fecha_realizacion, String descripcion, String link) {
        this.nombre = nombre;
        this.img = img;
        this.fecha_realizacion = fecha_realizacion;
        this.descripcion = descripcion;
        this.link = link;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getFecha_realizacion() {
        return fecha_realizacion;
    }

    public void setFecha_realizacion(String fecha_realizacion) {
        this.fecha_realizacion = fecha_realizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    

}
