package com.truper.practica.dto;

import com.truper.practica.model.Orden;

public class SucursalDto {


    Integer id;


    String nombre;

    Orden orden;

    public SucursalDto(){

    }

    public SucursalDto(String nombre, Orden orden) {
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
