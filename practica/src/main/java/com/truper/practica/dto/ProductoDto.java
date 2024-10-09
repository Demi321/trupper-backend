package com.truper.practica.dto;

import com.truper.practica.model.Orden;

import java.math.BigDecimal;

public class ProductoDto {


    Integer id;


    Orden orden;

    String codigo;


    String descripcion;



    BigDecimal precio;

    public ProductoDto(){}

    public ProductoDto(Orden orden, String codigo, String descripcion, BigDecimal precio) {
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
