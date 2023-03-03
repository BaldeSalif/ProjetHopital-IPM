package com.example.ipmhopital.services;

import com.example.ipmhopital.models.Disponibilite_medecin;
import com.example.ipmhopital.repository.Disponibilite_medecinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class Disponibilite_medecinServiceImpl implements Disponibilite_medecinService {

    @Autowired
    private Disponibilite_medecinRepository disponibilite_medecinRepository;

    @Override
    public Disponibilite_medecin save(Disponibilite_medecin disponibilite_medecin) {
        return disponibilite_medecinRepository.save(disponibilite_medecin);
    }

    @Override
    public Optional<Disponibilite_medecin> find(Long id) {
        return disponibilite_medecinRepository.findById(id);
    }

    @Override
    public List<Disponibilite_medecin> findAll() {
        return disponibilite_medecinRepository.findAll();
    }

    @Override
    public List<Disponibilite_medecin> findAll(Sort sort){
        return disponibilite_medecinRepository.findAll(sort);
    }

    @Override
    public Page<Disponibilite_medecin> findAll(Pageable pageable){
        return disponibilite_medecinRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    disponibilite_medecinRepository.deleteById(id);
    }

    @Override
    public void delete(Disponibilite_medecin disponibilite_medecin) {
        disponibilite_medecinRepository.delete(disponibilite_medecin);
    }

    @Override
    public void deleteAll() {
        disponibilite_medecinRepository.deleteAll();
    }

    @Override
    public long count() {
        return disponibilite_medecinRepository.count();
    }

}