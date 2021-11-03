package com.example.demoserviciocompra.dao;

import com.example.demoserviciocompra.entity.Compra;
import org.springframework.data.repository.CrudRepository;
//se injetc por defecto
public interface CompraDao extends CrudRepository<Compra,Long > {
}
