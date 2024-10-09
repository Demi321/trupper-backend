package com.truper.practica.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Table(name = "ordenes")
@Entity
public class Orden {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;


    @Column(name = "fecha")
    Date fecha;


    @Column(name = "total")
    BigDecimal total;

    @OneToMany(mappedBy = "orden")
     @JsonManagedReference
    List<Producto> producto;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    Sucursal sucursal;



    public Orden(){

    }

    public Orden(Date fecha, BigDecimal total, List<Producto> producto) {
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
