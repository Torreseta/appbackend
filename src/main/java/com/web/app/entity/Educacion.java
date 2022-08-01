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

    @Column(name="institucion", length=100,nullable=false)
    private String institucion;

    @Column(name="logo_img", length=1000,nullable=false)
    private String logo_img;

    @Column(name="periodo", length=20,nullable=false)
    private String periodo;

    @Column(name="titulo", length=100,nullable=false)
    private String titulo;

    public Educacion() {
    }

    public Educacion(int id, String institucion, String logo_img, String periodo, String titulo) {
        this.id = id;
        this.institucion = institucion;
        this.logo_img = logo_img;
        this.periodo = periodo;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getLogo_img() {
        return logo_img;
    }

    public void setLogo_img(String logo_img) {
        this.logo_img = logo_img;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
}