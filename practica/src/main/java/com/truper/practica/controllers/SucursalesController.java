package com.truper.practica.controllers;

import com.truper.practica.dto.SucursalDto;
import com.truper.practica.service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class SucursalesController {

    @Autowired
    SucursalService sucursalService;

    @PostMapping("")
    public ResponseEntity<SucursalDto> save(@RequestBody SucursalDto sucursalDto){


        return new ResponseEntity<>(sucursalService.save(sucursalDto), HttpStatus.OK);

    }

    @GetMapping("/getAll")
    public ResponseEntity<List<SucursalDto>> getAll(){


        return new ResponseEntity<>(sucursalService.getAll(), HttpStatus.OK);

    }

    @GetMapping("/test")
    public ResponseEntity<String> test(){

        return new ResponseEntity<>("test", HttpStatus.OK);

    }
}
