package com.web.app.dto;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;

public class AcercaDeDto implements Serializable {
    
    @NotBlank
    private String descripcion;

    public AcercaDeDto() {
    }

    public AcercaDeDto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}




    