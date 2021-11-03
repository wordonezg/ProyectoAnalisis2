package com.example.servicebodega.controler;

import com.example.servicebodega.interfaceService.IbodegaService;
import com.example.servicebodega.modelo.Bodega;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.core.env.Environment;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class Controlador {
    @Autowired
    private Environment env;
    
    @Autowired
    private IbodegaService service;

    @GetMapping("/lista")
    public List<Bodega> listar(){
        return service.listar().stream().map(bodega -> {
            bodega.setPort(Integer.parseInt(env.getProperty("local.server.port")));
        return bodega;
    }).collect(Collectors.toList());
    }

    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("bodega", new Bodega());
        return "form";
    }

    @PostMapping("/save")
    public String save(@Validated Bodega b, Model model){
        service.save(b);
        return "redirect:/listar";
    }
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Bodega>bodega=service.listarId(id);
        model.addAttribute("bodega",bodega);
        return "form";
    }

    @GetMapping("/eliminar/{id}")
    public String delete(Model model, @PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }
}
