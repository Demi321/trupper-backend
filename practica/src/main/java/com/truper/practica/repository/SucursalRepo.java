package com.truper.practica.repository;

import com.truper.practica.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SucursalRepo extends JpaRepository<Sucursal,Integer> {
}
