package com.truper.practica.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Table(name = "productos")
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @ManyToOne
    @JoinColumn(name="orden_id",nullable = false)
    @JsonBackReference
    Orden orden;

    @Column(name = "codigo")
    String codigo;

    @Column(name = "descripcion")
    String descripcion;


    @Column(name = "precio")
    BigDecimal precio;

    public Producto(){}

    public Producto(Orden orden, String codigo, String descripcion, BigDecimal precio) {
        this.orden = orden;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}
