package com.web.app.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table (name="acercade")
public class AcercaDe implements Serializable{
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="descripcion", length=1000,nullable=false)
    private String descripcion;

    public AcercaDe() {
    }

    public AcercaDe(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}