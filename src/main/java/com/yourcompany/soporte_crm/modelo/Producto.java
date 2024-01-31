package com.yourcompany.soporte_crm.modelo;

import java.util.*;

import javax.persistence.*;

@Entity
public class Producto {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "producto")
    private Collection<Caso> casos;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Collection<Caso> getCasos() {
        return casos;
    }

    public void setCasos(Collection<Caso> casos) {
        this.casos = casos;
    }
}
