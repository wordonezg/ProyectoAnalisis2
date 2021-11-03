package com.example.servicebodega.service;

import com.example.servicebodega.interfaceService.IbodegaService;
import com.example.servicebodega.interfaces.IBodega;
import com.example.servicebodega.modelo.Bodega;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BodegaService implements IbodegaService {

    @Autowired
    private IBodega data;

    @Override
    public List<Bodega>listar(){
        return (List<Bodega>) data.findAll();
    }

    @Override
    public Optional<Bodega>listarId(int id){
        return data.findById(id);
    }

    @Override
    public int save(Bodega b){
        int res=0;
        Bodega bodega=data.save(b);
        if(!bodega.equals(null)){
            res=1;
        }
        return res;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}
