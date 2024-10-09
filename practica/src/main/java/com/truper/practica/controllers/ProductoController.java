package com.truper.practica.controllers;

import com.truper.practica.dto.ProductoDto;
import com.truper.practica.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @PostMapping("")
    public ResponseEntity<ProductoDto> save(@RequestBody ProductoDto productoDto){


        return new ResponseEntity<>(productoService.save(productoDto), HttpStatus.OK);

    }
    @PostMapping("/saveMany")
    public ResponseEntity<List<ProductoDto>> saveMany(@RequestBody List<ProductoDto> productoDto){


        return new ResponseEntity<>(productoService.saveMany(productoDto), HttpStatus.OK);

    }

    @PutMapping("")
    public ResponseEntity<ProductoDto> update(@RequestBody ProductoDto productoDto){


        return new ResponseEntity<>(productoService.save(productoDto), HttpStatus.OK);

    }

    @GetMapping("/test")
    public ResponseEntity<String> test(){

        return new ResponseEntity<>("test", HttpStatus.OK);

    }
}
