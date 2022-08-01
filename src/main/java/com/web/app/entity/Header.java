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
    
    @Column(name="img_perfil", length=1000,nullable=false)
    private String img_perfil;
   
    @Column(name="img_logo", length=1000,nullable=false)
    private String img_logo;

    @Column(name="nombre", length=45,nullable=false)
    private String nombre;

    @Column(name="posicion", length=45,nullable=false)
    private String posicion;

    @Column(name="puesto", length=45,nullable=false)
    private String puesto;

    public Header() {
    }

    public Header(int id, String img_banner, String img_perfil, String img_logo, String nombre, String posicion, String puesto) {
        this.id = id;
        this.img_banner = img_banner;
        this.img_perfil = img_perfil;
        this.img_logo = img_logo;
        this.nombre = nombre;
        this.posicion = posicion;
        this.puesto = puesto;
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