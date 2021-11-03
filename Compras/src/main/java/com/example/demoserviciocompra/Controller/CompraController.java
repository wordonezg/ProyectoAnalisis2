package com.example.demoserviciocompra.Controller;

import com.example.demoserviciocompra.Service.ICompraService;
import com.example.demoserviciocompra.entity.Compra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CompraController {
    @Autowired
    private Environment env;
    @Autowired
    private ICompraService productoService;

    @GetMapping("/lista")
    public List<Compra> listar(){
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Compra> getCompra(@PathVariable("id") Long id){
        Optional<Compra> compra = productoService.findbyId(id);
        if(compra == null){
            throw new RuntimeException(("no encontrado"));
        }
        return compra;
    }
    @PutMapping("/")
    public void updateCompra(@RequestBody Compra compra){
        productoService.save(compra);
    }

    @PostMapping("/")
    public Compra guardar(@RequestBody Compra compra) {
        productoService.save(compra);
        return compra;
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id){
        productoService.deleteById(id);
    }


}