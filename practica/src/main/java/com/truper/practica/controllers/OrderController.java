package com.truper.practica.controllers;

import com.truper.practica.dto.OrdenDto;
import com.truper.practica.dto.SucursalDto;
import com.truper.practica.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordenes")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("")
    public ResponseEntity<OrdenDto> save(@RequestBody  OrdenDto orderDto){


        return new ResponseEntity<>(orderService.save(orderDto), HttpStatus.OK);

    }

    @GetMapping("/getAll")
    public ResponseEntity<List<OrdenDto>> getAll(){


        return new ResponseEntity<>(orderService.getAll(), HttpStatus.OK);

    }

    @GetMapping("/test")
    public ResponseEntity<String> test(){

    return new ResponseEntity<>("test", HttpStatus.OK);

    }


}
