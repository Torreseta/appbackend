package com.web.app.dto;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;

public class ExperienciaDto implements Serializable{

    @NotBlank
    private String empresa;
    @NotBlank
    private String img_exp;
    @NotBlank
    private String cargo;
    @NotBlank
    private String inicio;
    @NotBlank
    private String fin;
    @NotBlank
    private String provincia;
    @NotBlank
    private String pais;

    public ExperienciaDto() {
    }

    public ExperienciaDto(String empresa, String img_exp, String cargo, String inicio, String fin, String provincia, String pais) {
        this.empresa = empresa;
        this.img_exp = img_exp;
        this.cargo = cargo;
        this.inicio = inicio;
        this.fin = fin;
        this.provincia = provincia;
        this.pais = pais;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getImg_exp() {
        return img_exp;
    }

    public void setImg_exp(String img_exp) {
        this.img_exp = img_exp;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}