package com.turmelo.jpa.demo.repository;

import com.turmelo.jpa.demo.model.Marca;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface MarcaRepository extends CrudRepository<Marca, Integer> {
}
