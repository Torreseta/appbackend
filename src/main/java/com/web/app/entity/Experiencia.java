package com.web.app.entity;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table (name="experiencia")
public class Experiencia implements Serializable{

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="empresa", length=45,nullable=false)
    private String empresa;

    @Column(name="img_exp", length=1000,nullable=false)
    private String img_exp;

    @Column(name="cargo", length=45,nullable=false)
    private String cargo;

    @Column(name="inicio", length=20,nullable=false)
    private String inicio;

    
    @Column(name="fin", length=20,nullable=false)
    private String fin;

    @Column(name="provincia", length=45,nullable=false)
    private String provincia;

    @Column(name="pais", length=45,nullable=false)
    private String pais;

    public Experiencia() {
    }

    public Experiencia(int id, String empresa, String img_exp, String cargo, String inicio, String fin, String provincia, String pais) {
        this.id = id;
        this.empresa = empresa;
        this.img_exp = img_exp;
        this.cargo = cargo;
        this.inicio = inicio;
        this.fin = fin;
        this.provincia = provincia;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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