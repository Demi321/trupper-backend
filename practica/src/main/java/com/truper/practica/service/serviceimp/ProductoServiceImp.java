package com.truper.practica.service.serviceimp;

import com.truper.practica.dto.ProductoDto;
import com.truper.practica.model.Producto;
import com.truper.practica.repository.ProductRepo;
import com.truper.practica.service.ProductoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ProductoServiceImp implements ProductoService {

    @Autowired
    ProductRepo productRepo;


    @Autowired
    ModelMapper modelMapper;


    @Override
    public ProductoDto save(ProductoDto productoDto) {

        Producto product=modelMapper.map(productoDto,Producto.class);
        product=productRepo.save(product);

        return modelMapper.map(product, ProductoDto.class);
    }

    @Override
    public List<ProductoDto> saveMany(List<ProductoDto> productoDto) {
        List<Producto> productList=productoDto.stream().map(productDto->modelMapper.map(productDto,Producto.class)).toList();

      return productRepo.saveAll(productList).stream().map(product->modelMapper.map(product,ProductoDto.class)).toList();


    }

    @Override
    public List<ProductoDto> getAll() {
        return  productRepo.findAll()
                .stream()
                .map(producto -> modelMapper.map(producto,ProductoDto.class)).collect(Collectors.toList());
    }

    @Override
    public ProductoDto getById() {
        return null;
    }

    @Override
    public void delete() {

    }
}
