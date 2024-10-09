package com.truper.practica.service;

import com.truper.practica.dto.ProductoDto;

import java.util.List;

public interface ProductoService {

    public ProductoDto save(ProductoDto productoDto);
    public List<ProductoDto> saveMany(List<ProductoDto> productoDto);
    public List<ProductoDto> getAll();
    public ProductoDto getById();
    public void delete();
}
