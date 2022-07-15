package com.web.app.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table (name="proyectos")
public class Proyectos implements Serializable{
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="nombre", length=45,nullable=false)
    private String nombre;

    @Column(name="img", length=1000,nullable=false)
    private String img;

    @Column(name="fecha_realizacion", length=45,nullable=false)
    private String fecha_realizacion;

    @Column(name="descripcion", length=1000,nullable=false)
    private String descripcion;

    
    @Column(name="link", length=1000,nullable=false)
    private String link;

    public Proyectos() {
    }

    public Proyectos(int id, String nombre, String img, String fecha_realizacion, String descripcion, String link) {
        this.id = id;
        this.nombre = nombre;
        this.img = img;
        this.fecha_realizacion = fecha_realizacion;
        this.descripcion = descripcion;
        this.link = link;
    }

    public Proyectos(String nombre, String img, String fecha_realizacion, String descripcion, String link) {
        this.nombre = nombre;
        this.img = img;
        this.fecha_realizacion = fecha_realizacion;
        this.descripcion = descripcion;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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