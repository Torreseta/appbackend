package com.web.app.entity;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table (name="header")
public class Header implements Serializable {
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="img_banner", length=1000,nullable=false)
    private String img_banner;
    
    @Column(name="perfil", length=45,nullable=false)
    private String perfil;

    @Column(name="img_perfil", length=1000,nullable=false)
    private String img_perfil;
   
    @Column(name="nombre", length=45,nullable=false)
    private String nombre;

    @Column(name="posicion", length=45,nullable=false)
    private String posicion;

    @Column(name="titulo", length=45,nullable=false)
    private String titulo;

    public Header() {
    }

    public Header(int id, String img_banner, String perfil, String img_perfil, String nombre, String posicion, String titulo) {
        this.id = id;
        this.img_banner = img_banner;
        this.perfil = perfil;
        this.img_perfil = img_perfil;
        this.nombre = nombre;
        this.posicion = posicion;
        this.titulo = titulo;
    }

    public Header(String img_banner, String perfil, String img_perfil, String nombre, String posicion, String titulo) {
        this.img_banner = img_banner;
        this.perfil = perfil;
        this.img_perfil = img_perfil;
        this.nombre = nombre;
        this.posicion = posicion;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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