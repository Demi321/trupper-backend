package com.truper.practica.model;

import jakarta.persistence.*;


@Table(name = "sucursales")
@Entity
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;


    @Column(name = "nombre")
    String nombre;

    @OneToOne(mappedBy = "sucursal")
    Orden orden;

    public Sucursal(){

    }

    public Sucursal(String nombre, Orden orden) {
        this.nombre = nombre;
        this.orden = orden;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
