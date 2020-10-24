package com.turmelo.jpa.demo.repository;

import com.turmelo.jpa.demo.model.Modelo;
import org.springframework.data.repository.CrudRepository;

public interface ModeloRepository extends CrudRepository<Modelo, Integer> {
}
