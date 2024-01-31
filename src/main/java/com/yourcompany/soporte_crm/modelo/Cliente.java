package com.yourcompany.soporte_crm.modelo;

import java.util.*;

import javax.persistence.*;

@Entity
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nombre;
    private String contacto;

    @OneToMany(mappedBy = "cliente")
    private Collection<Caso> casos;

 // Getters y setters para Cliente
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

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Collection<Caso> getCasos() {
        return casos;
    }

    public void setCasos(Collection<Caso> casos) {
        this.casos = casos;
    }
    
}

