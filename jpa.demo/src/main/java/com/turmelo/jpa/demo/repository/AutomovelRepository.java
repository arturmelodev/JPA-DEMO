package com.turmelo.jpa.demo.repository;

import com.turmelo.jpa.demo.model.Automovel;
import org.springframework.data.repository.CrudRepository;

public interface AutomovelRepository extends CrudRepository<Automovel, Integer> {
}
