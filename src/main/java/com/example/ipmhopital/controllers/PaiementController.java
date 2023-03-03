package com.example.ipmhopital.controllers;

import com.example.ipmhopital.models.Paiement;
import com.example.ipmhopital.services.PaiementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class PaiementController {

    @Autowired
    private PaiementService paiementService;

    @PostMapping("/paiement")
    public Paiement save(@RequestBody Paiement paiement){
        return paiementService.save(paiement);
    }

    @GetMapping("/paiement/{id}")
    public Optional<Paiement> getById(@PathVariable(value = "id") Long id){
        return paiementService.find(id);
    }

    @GetMapping("/paiement")
    public List<Paiement> getAll(){
        return paiementService.findAll();
    }

    @DeleteMapping("/paiement/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        paiementService.delete(id);
    }

    @DeleteMapping("/paiement")
    public void deleteAll(){
        paiementService.deleteAll();
    }

    @GetMapping("/paiement/count")
    public long count(){
        return paiementService.count();
    }
}