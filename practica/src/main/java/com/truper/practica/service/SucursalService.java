package com.truper.practica.service;

import com.truper.practica.dto.SucursalDto;

import java.util.List;

public interface SucursalService {


    public SucursalDto save(SucursalDto sucursalDto);
    public List<SucursalDto> getAll();
    public SucursalDto getById();
    public void delete();
}
