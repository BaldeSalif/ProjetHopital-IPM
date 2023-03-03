package com.example.ipmhopital.controllers;

import com.example.ipmhopital.models.Patient;

import com.example.ipmhopital.repository.PaiementRepository;
import com.example.ipmhopital.repository.PatientRepository;
import com.example.ipmhopital.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private PaiementRepository paiementRepository;

    @PostMapping("/patient")
    public Patient save(@RequestBody Patient patient){
        return patientRepository.save(patient);
    }

    @GetMapping("/patient/{id}")
    public Optional<Patient> getById(@PathVariable(value = "id") Long id){
        return patientRepository.findById(id);
    }

    @GetMapping("/patient")
    public List<Patient> getAll(){
        return patientRepository.findAll();
    }

    @DeleteMapping("/patient/{id}")
    public void deleteById(@RequestBody Patient patient){
        patientRepository.delete(patient);
    }


    @GetMapping("/patient/count")
    public long count(){
        return paiementRepository.count();
    }
}
