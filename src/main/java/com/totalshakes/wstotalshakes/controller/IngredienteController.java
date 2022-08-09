package com.totalshakes.wstotalshakes.controller;

import com.totalshakes.wstotalshakes.entity.Ingrediente;
import com.totalshakes.wstotalshakes.service.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@RestController
public class IngredienteController {

    @Autowired
    private IngredienteService service;

    @PostMapping("/ingredientes")
    public Ingrediente addIngrediente(@RequestBody Ingrediente ingrediente){
        //TODO
        return null;
    }

    @GetMapping("/ingredientes")
    public Iterable<Ingrediente> findAllIngredientes(){
        //TODO
        return null;
    }

    @GetMapping("/ingredientes/{id}")
    public Ingrediente findIngredinteById(@PathVariable Integer id){
        //TODO
        return null;
    }

    @PutMapping("/ingredientes/{id}")
    public Ingrediente updateIngrediente(@RequestBody Ingrediente ingrediente,@PathVariable Integer id){
        //TODO
        return null;
    }
}