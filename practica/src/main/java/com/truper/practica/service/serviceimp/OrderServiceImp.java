package com.truper.practica.service.serviceimp;

import com.truper.practica.dto.OrdenDto;
import com.truper.practica.model.Orden;
import com.truper.practica.repository.OrdenRepo;
import com.truper.practica.service.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImp implements OrderService {


    @Autowired
    OrdenRepo ordenRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public OrdenDto save(OrdenDto orderDto) {
        Orden order=modelMapper.map(orderDto,Orden.class);
        order=ordenRepo.save(order);

        return modelMapper.map(order,OrdenDto.class);
    }

    @Override
    public List<OrdenDto> getAll() {


        return  ordenRepo.findAll()
                .stream()
                .map(orden -> modelMapper.map(orden,OrdenDto.class)).collect(Collectors.toList());


    }

    @Override
    public OrdenDto getById() {
        return null;
    }

    @Override
    public void delete() {

    }
}
