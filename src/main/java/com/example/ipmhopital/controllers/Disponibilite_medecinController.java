package com.example.ipmhopital.controllers;

import com.example.ipmhopital.models.Disponibilite_medecin;
import com.example.ipmhopital.services.Disponibilite_medecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class Disponibilite_medecinController {

    @Autowired
    private Disponibilite_medecinService disponibilite_medecinService;

    @PostMapping("/disponibilite_medecin")
    public Disponibilite_medecin save(@RequestBody Disponibilite_medecin disponibilite_medecin){
        return disponibilite_medecinService.save(disponibilite_medecin);
    }

    @GetMapping("/disponibilite_medecin/{id}")
    public Optional<Disponibilite_medecin> getById(@PathVariable(value = "id") Long id){
        return disponibilite_medecinService.find(id);
    }

    @GetMapping("/disponibilite_medecin")
    public List<Disponibilite_medecin> getAll(){
        return disponibilite_medecinService.findAll();
    }

    @DeleteMapping("/disponibilite_medecin/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        disponibilite_medecinService.delete(id);
    }

    @DeleteMapping("/disponibilite_medecin")
    public void deleteAll(){
        disponibilite_medecinService.deleteAll();
    }

    @GetMapping("/disponibilite_medecin/count")
    public long count(){
        return disponibilite_medecinService.count();
    }
}