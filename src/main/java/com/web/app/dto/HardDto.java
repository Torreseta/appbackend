package com.web.app.dto;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;

public class HardDto implements Serializable{
    @NotBlank
    private String porcentaje;
    @NotBlank
    private String lenguaje;

    public HardDto() {
    }

    public HardDto(String porcentaje, String lenguaje) {
        this.porcentaje = porcentaje;
        this.lenguaje = lenguaje;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
}
