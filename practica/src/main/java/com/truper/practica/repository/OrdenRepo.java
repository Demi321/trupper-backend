package com.truper.practica.repository;

import com.truper.practica.model.Orden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdenRepo extends JpaRepository<Orden,Integer> {
}
