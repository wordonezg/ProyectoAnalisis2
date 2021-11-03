package com.example.demoserviciodonacion.dao;

import com.example.demoserviciodonacion.entity.Donacion;
import org.springframework.data.repository.CrudRepository;
//se injetc por defecto
public interface DonacionDao extends CrudRepository<Donacion,Long > {
}
