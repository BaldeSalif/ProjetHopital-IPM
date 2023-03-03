package com.example.ipmhopital.services;

import com.example.ipmhopital.models.Personnels_Medical;
import com.example.ipmhopital.repository.Personnels_MedicalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class Personnels_MedicalServiceImpl implements Personnels_MedicalService {

    @Autowired
    private Personnels_MedicalRepository personnels_medicalRepository;

    @Override
    public Personnels_Medical save(Personnels_Medical personnels_medical) {
        return personnels_medicalRepository.save(personnels_medical);
    }

    @Override
    public Optional<Personnels_Medical> find(Long id) {
        return personnels_medicalRepository.findById(id);
    }

    @Override
    public List<Personnels_Medical> findAll() {
        return personnels_medicalRepository.findAll();
    }

    @Override
    public List<Personnels_Medical> findAll(Sort sort){
        return personnels_medicalRepository.findAll(sort);
    }

    @Override
    public Page<Personnels_Medical> findAll(Pageable pageable){
        return personnels_medicalRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    personnels_medicalRepository.deleteById(id);
    }

    @Override
    public void delete(Personnels_Medical personnels_medical) {
        personnels_medicalRepository.delete(personnels_medical);
    }

    @Override
    public void deleteAll() {
        personnels_medicalRepository.deleteAll();
    }

    @Override
    public long count() {
        return personnels_medicalRepository.count();
    }

}