package com.web.app.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table (name="hard")
public class Hard implements Serializable{
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="porcentaje", length=3,nullable=false)
    private String porcentaje;

    @Column(name="lenguaje", length=15,nullable=false)
    private String lenguaje;

    public Hard() {
    }

    public Hard(int id, String porcentaje, String lenguaje) {
        this.id = id;
        this.porcentaje = porcentaje;
        this.lenguaje = lenguaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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