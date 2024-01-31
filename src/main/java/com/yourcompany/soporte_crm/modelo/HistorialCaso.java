package com.yourcompany.soporte_crm.modelo;

import java.util.*;

import javax.persistence.*;

import com.yourcompany.soporte_crm.enums.*;

@Entity
public class HistorialCaso {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(length = 500)
    private String descripcionEvento;

    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;

    @ManyToOne(fetch = FetchType.LAZY)
    private Caso caso;

 // Getters y setters para HistorialCaso
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Caso getCaso() {
        return caso;
    }

    public void setCaso(Caso caso) {
        this.caso = caso;
    }
}
