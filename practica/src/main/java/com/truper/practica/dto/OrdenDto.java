package com.truper.practica.dto;

import com.truper.practica.model.Producto;
import com.truper.practica.model.Sucursal;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrdenDto {



    Integer id;


    Date fecha;



    BigDecimal total;


    List<Producto> producto;



    Sucursal sucursal;



    public OrdenDto(){

    }

    public OrdenDto(Date fecha, BigDecimal total, List<Producto> producto) {
        this.fecha = fecha;
        this.total = total;
        this.producto = producto;
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
