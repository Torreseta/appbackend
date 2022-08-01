package com.web.app.dto;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;


public class PersonalDto implements Serializable{
    
    @NotBlank
    private String header;
    @NotBlank
    private String acercade;
    @NotBlank
    private String educacion;
    @NotBlank
    private String experiencia;
    @NotBlank
    private String hard;
    @NotBlank
    private String proyectos;

    public PersonalDto() {
    }

    public PersonalDto(String header, String acercade, String educacion, String experiencia, String hard, String proyectos) {
        this.header = header;
        this.acercade = acercade;
        this.educacion = educacion;
        this.experiencia = experiencia;
        this.hard = hard;
        this.proyectos = proyectos;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getAcercade() {
        return acercade;
    }

    public void setAcercade(String acercade) {
        this.acercade = acercade;
    }

    public String getEducacion() {
        return educacion;
    }

    public void setEducacion(String educacion) {
        this.educacion = educacion;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getHard() {
        return hard;
    }

    public void setHard(String hard) {
        this.hard = hard;
    }

    public String getProyectos() {
        return proyectos;
    }

    public void setProyectos(String proyectos) {
        this.proyectos = proyectos;
    }
    
}
