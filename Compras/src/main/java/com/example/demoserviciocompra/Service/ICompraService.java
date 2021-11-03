package com.example.demoserviciocompra.Service;

import com.example.demoserviciocompra.entity.Compra;

import java.util.List;
import java.util.Optional;

public interface ICompraService {
    public List<Compra> findAll();
    public Optional<Compra> findbyId(Long id);
    public void save(Compra compra);
    public void deleteById(Long id);
}
