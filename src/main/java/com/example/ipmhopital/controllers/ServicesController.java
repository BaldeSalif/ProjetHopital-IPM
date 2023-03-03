package com.example.ipmhopital.controllers;

import com.example.ipmhopital.models.Services;
import com.example.ipmhopital.repository.ServicesRepository;
import com.example.ipmhopital.services.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class ServicesController {

    @Autowired
    private ServicesRepository servicesRepository;

    @PostMapping("/services")
    public Services save(@RequestBody Services services){
        return servicesRepository.save(services);
    }

    @GetMapping("/services/{id}")
    public Optional<Services> getById(@PathVariable(value = "id") Long id){
        return servicesRepository.findById(id);
    }

    @GetMapping("/services")
    public List<Services> getAll(){
        return servicesRepository.findAll();
    }

    @DeleteMapping("/services")
    public void delete(@RequestBody Services services){
        servicesRepository.delete(services);
    }

//    @DeleteMapping("/services")
//    public void deleteAll(){
//        servicesRepository.deleteAll();
//    }

    @GetMapping("/services/count")
    public long count(){
        return servicesRepository.count();
    }
}
