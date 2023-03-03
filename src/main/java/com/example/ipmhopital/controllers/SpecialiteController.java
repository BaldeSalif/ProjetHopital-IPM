package com.example.ipmhopital.controllers;

import com.example.ipmhopital.models.Specialite;
import com.example.ipmhopital.services.SpecialiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class SpecialiteController {

    @Autowired
    private SpecialiteService specialiteService;

    @PostMapping("/specialite")
    public Specialite save(@RequestBody Specialite specialite){
        return specialiteService.save(specialite);
    }

    @GetMapping("/specialite/{id}")
    public Optional<Specialite> getById(@PathVariable(value = "id") Long id){
        return specialiteService.find(id);
    }

    @GetMapping("/specialite")
    public List<Specialite> getAll(){
        return specialiteService.findAll();
    }

    @DeleteMapping("/specialite/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        specialiteService.delete(id);
    }


    @GetMapping("/specialite/count")
    public long count(){
        return specialiteService.count();
    }
}
