package com.truper.practica.repository;

import com.truper.practica.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Producto,Integer> {
}
