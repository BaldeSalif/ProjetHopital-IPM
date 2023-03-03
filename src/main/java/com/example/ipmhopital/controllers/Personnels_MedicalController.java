package com.example.ipmhopital.controllers;

import com.example.ipmhopital.models.Personnels_Medical;
import com.example.ipmhopital.services.Personnels_MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class Personnels_MedicalController {

    @Autowired
    private Personnels_MedicalService personnels_medicalService;

    @PostMapping("/personnels_medical")
    public Personnels_Medical save(@RequestBody Personnels_Medical personnels_medical){
        return personnels_medicalService.save(personnels_medical);
    }

    @GetMapping("/personnels_medical/{id}")
    public Optional<Personnels_Medical> getById(@PathVariable(value = "id") Long id){
        return personnels_medicalService.find(id);
    }

    @GetMapping("/personnels_medical")
    public List<Personnels_Medical> getAll(){
        return personnels_medicalService.findAll();
    }

    @DeleteMapping("/personnels_medical/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        personnels_medicalService.delete(id);
    }

    @DeleteMapping("/personnels_medical")
    public void deleteAll(){
        personnels_medicalService.deleteAll();
    }

    @GetMapping("/personnels_medical/count")
    public long count(){
        return personnels_medicalService.count();
    }
}