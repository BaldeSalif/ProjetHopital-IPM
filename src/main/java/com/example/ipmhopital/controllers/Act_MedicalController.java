package com.example.ipmhopital.controllers;

import com.example.ipmhopital.models.Act_Medical;
import com.example.ipmhopital.repository.Act_MedicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class Act_MedicalController {
    @Autowired
    private Act_MedicalRepository actMedicalRepository;

    @PostMapping("/act_medical")
    public Act_Medical save(@RequestBody Act_Medical act_medical){
        return actMedicalRepository.save(act_medical);
    }

    @GetMapping("/act_medical/{id}")
    public Optional<Act_Medical> getById(@PathVariable(value = "id") Long id){
        return actMedicalRepository.findById(id);
    }

    @GetMapping("/act_medical")
    public List<Act_Medical> getAll(){
        return actMedicalRepository.findAll();
    }

   /* @DeleteMapping("/act_medical/{id}")
    public void deleteById(@PathVariable(value = "id") Long id){
        actMedicalRepository.delete(id);
    } */
    @DeleteMapping("/act_medical/")
    public void delete(@RequestBody Act_Medical act_medical){
        actMedicalRepository.delete(act_medical);
    }

    @DeleteMapping("/act_medical")
    public void deleteAll(){
        actMedicalRepository.deleteAll();
    }

    @GetMapping("/act_medical/count")
    public long count(){
        return actMedicalRepository.count();
    }
}
