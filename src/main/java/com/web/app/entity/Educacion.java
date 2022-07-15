package com.web.app.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table (name="educacion")
public class Educacion implements Serializable{
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="logo_img", length=1000,nullable=false)
    private String logo_img;

    @Column(name="institucion", length=100,nullable=false)
    private String institucion;

    @Column(name="titulo", length=100,nullable=false)
    private String titulo;

    @Column(name="periodo", length=20,nullable=false)
    private String periodo;

    public Educacion() {
    }

    public Educacion(int id, String logo_img, String institucion, String titulo, String periodo) {
        this.id = id;
        this.logo_img = logo_img;
        this.institucion = institucion;
        this.titulo = titulo;
        this.periodo = periodo;
    }

    public Educacion(String logo_img, String institucion, String titulo, String periodo) {
        this.logo_img = logo_img;
        this.institucion = institucion;
        this.titulo = titulo;
        this.periodo = periodo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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