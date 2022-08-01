package com.web.app.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table (name="personal")
public class Personal implements Serializable{
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="header", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String header;

    @Column(name="acercade",  nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String acercade;

    @Column(name="educacion",  nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private String educacion;

    @Column(name="experiencia", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private String experiencia;

    @Column(name="hard",  nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String hard;

    @Column(name="proyectos", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String proyectos;

    public Personal() {
    }

    public Personal(int id, String header, String acercade, String educacion, String experiencia, String hard, String proyectos) {
        this.id = id;
        this.header = header;
        this.acercade = acercade;
        this.educacion = educacion;
        this.experiencia = experiencia;
        this.hard = hard;
        this.proyectos = proyectos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
