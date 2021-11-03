package com.example.servicebodega.interfaceService;

import com.example.servicebodega.modelo.Bodega;

import java.util.List;
import java.util.Optional;

public interface IbodegaService {
    public List<Bodega>listar();
    public Optional<Bodega>listarId(int id);
    public int save(Bodega b);
    public void delete(int id);
}
