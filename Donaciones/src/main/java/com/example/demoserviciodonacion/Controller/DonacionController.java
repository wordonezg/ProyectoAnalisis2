package com.example.demoserviciodonacion.Controller;

import com.example.demoserviciodonacion.Service.IDonacionService;
import com.example.demoserviciodonacion.entity.Donacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DonacionController {
    @Autowired
    private Environment env;
    @Autowired
    private IDonacionService productoService;

    @GetMapping("/lista")
    public List<Donacion> listar(){
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Donacion> getDonacion(@PathVariable("id") Long id){
        Optional<Donacion> donacion = productoService.findbyId(id);
        if(donacion == null){
            throw new RuntimeException(("no encontrado"));
        }
        return donacion;
    }
    @PutMapping("/")
    public void updateDonacion(@RequestBody Donacion donacion){
        productoService.save(donacion);
    }

    @PostMapping("/")
    public Donacion guardar(@RequestBody Donacion donacion) {
        productoService.save(donacion);
        return donacion;
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id){
        productoService.deleteById(id);
    }


}