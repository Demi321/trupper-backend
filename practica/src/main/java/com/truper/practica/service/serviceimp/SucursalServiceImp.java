package com.truper.practica.service.serviceimp;

import com.truper.practica.dto.ProductoDto;
import com.truper.practica.dto.SucursalDto;
import com.truper.practica.model.Producto;
import com.truper.practica.model.Sucursal;
import com.truper.practica.repository.SucursalRepo;
import com.truper.practica.service.SucursalService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class SucursalServiceImp implements SucursalService {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    SucursalRepo sucursalRepo;

    @Override
    public SucursalDto save(SucursalDto sucursalDto) {
        Sucursal sucursal=modelMapper.map(sucursalDto,Sucursal.class);
        sucursal=sucursalRepo.save(sucursal);

        return modelMapper.map(sucursal, SucursalDto.class);
    }

    @Override
    public List<SucursalDto> getAll() {
        return  sucursalRepo.findAll()
                .stream()
                .map(sucursal -> modelMapper.map(sucursal,SucursalDto.class)).collect(Collectors.toList());
    }

    @Override
    public SucursalDto getById() {
        return null;
    }

    @Override
    public void delete() {

    }
}
