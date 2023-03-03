package com.example.ipmhopital.controllers;

import com.example.ipmhopital.models.Rendez_Vous;
import com.example.ipmhopital.repository.Rendez_VousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class Rendez_VousController {

    @Autowired
     Rendez_VousRepository rendez_vousRepository;

    @PostMapping("/rendezVous")
    public Rendez_Vous save(@RequestBody Rendez_Vous rendez_vous){
        return rendez_vousRepository.save(rendez_vous);
    }

    @GetMapping("/rendezVous/{id}")
    public Optional<Rendez_Vous> getById(@PathVariable(value = "id") Long id){
        return rendez_vousRepository.findById(id);
    }
    @GetMapping("/rendezVous/{NomMed}")
    public List<Rendez_Vous> getRvByNomMed(@PathVariable(value = "NomMed") String NomMed){
        return rendez_vousRepository.findRvByNomMed(NomMed);
    }

    @GetMapping("/rendezVous")
    public List<Rendez_Vous> getAll(){
        return rendez_vousRepository.findAll();
    }

    @DeleteMapping("/rendezVous}")
    public void delete(@RequestBody Rendez_Vous rendez_vous){
        rendez_vousRepository.delete(rendez_vous);
    }


    @GetMapping("/rendezVous/count")
    public long count(){
        return rendez_vousRepository.count();
    }
}
