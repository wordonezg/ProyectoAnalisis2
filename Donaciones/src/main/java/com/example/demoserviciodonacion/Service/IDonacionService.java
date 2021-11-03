package com.example.demoserviciodonacion.Service;

import com.example.demoserviciodonacion.entity.Donacion;

import java.util.List;
import java.util.Optional;

public interface IDonacionService {
    public List<Donacion> findAll();
    public Optional<Donacion> findbyId(Long id);
    public void save(Donacion donacion);
    public void deleteById(Long id);
}
