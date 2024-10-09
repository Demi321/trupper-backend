package com.truper.practica.service;
import com.truper.practica.dto.OrdenDto;

import java.util.List;


public interface OrderService {

    public OrdenDto save(OrdenDto orderDto);
    public List<OrdenDto> getAll();
    public OrdenDto getById();
    public void delete();
}
