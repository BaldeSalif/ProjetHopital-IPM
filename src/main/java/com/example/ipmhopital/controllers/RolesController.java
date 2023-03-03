package com.example.ipmhopital.controllers;

import com.example.ipmhopital.models.Roles;
import com.example.ipmhopital.repository.RolesRepository;
import com.example.ipmhopital.services.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("")
public class RolesController {

    @Autowired
    private RolesService rolesService;
    @Autowired
    private RolesRepository rolesRepository;

    @PostMapping("/roles")
    public Roles save(@RequestBody Roles roles){
        return rolesRepository.save(roles);
    }

    @GetMapping("/roles/{id}")
    public Optional<Roles> getById(@PathVariable(value = "id") Long id){

        return rolesRepository.findById(id);
    }

    @GetMapping("/roles")
    public List<Roles> getAll(){
        return rolesRepository.findAll();
    }

    @DeleteMapping("/roles")
    public void deleteById(@RequestBody Roles roles){
        rolesRepository.delete(roles);
    }

   /* @DeleteMapping("/roles")
    public void deleteAll(){
        rolesRepository.deleteAll();
    }*/

    @GetMapping("/roles/count")
    public long count(){
        return rolesRepository.count();
    }
}
