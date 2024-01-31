package com.yourcompany.soporte_crm.modelo;

import java.util.*;

import javax.persistence.*;

@Entity
public class Agente {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nombre;
    private String habilidades;
    private int cargaTrabajo;

    @OneToMany(mappedBy = "agenteAsignado")
    private Collection<Caso> casosAsignados;

 // Getters y setters para Agente
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

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public int getCargaTrabajo() {
        return cargaTrabajo;
    }

    public void setCargaTrabajo(int cargaTrabajo) {
        this.cargaTrabajo = cargaTrabajo;
    }

    public Collection<Caso> getCasosAsignados() {
        return casosAsignados;
    }

    public void setCasosAsignados(Collection<Caso> casosAsignados) {
        this.casosAsignados = casosAsignados;
    }
}
