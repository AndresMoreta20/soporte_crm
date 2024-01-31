package com.yourcompany.soporte_crm.modelo;
import java.util.*;

import javax.persistence.*;

import com.yourcompany.soporte_crm.enums.*;

@Entity
public class Caso {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(length = 500)
    private String descripcion;

    @Enumerated(EnumType.STRING)
    private EstadoCaso estado;

    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    private Producto producto;

    @ManyToOne(fetch = FetchType.LAZY)
    private Agente agenteAsignado;

    @OneToMany(mappedBy = "caso")
    private Collection<HistorialCaso> historial;

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

    public EstadoCaso getEstado() {
        return estado;
    }

    public void setEstado(EstadoCaso estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Agente getAgenteAsignado() {
        return agenteAsignado;
    }

    public void setAgenteAsignado(Agente agenteAsignado) {
        this.agenteAsignado = agenteAsignado;
    }

    public Collection<HistorialCaso> getHistorial() {
        return historial;
    }

    public void setHistorial(Collection<HistorialCaso> historial) {
        this.historial = historial;
    }
}
