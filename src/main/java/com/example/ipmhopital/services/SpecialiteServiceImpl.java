package com.example.ipmhopital.services;

import com.example.ipmhopital.models.Specialite;
import com.example.ipmhopital.repository.SpecialiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class SpecialiteServiceImpl implements SpecialiteService {

    @Autowired
    private SpecialiteRepository specialiteRepository;

    @Override
    public Specialite save(Specialite specialite) {
        return specialiteRepository.save(specialite);
    }

    @Override
    public Optional<Specialite> find(Long id) {
        return specialiteRepository.findById(id);
    }

    @Override
    public List<Specialite> findAll() {
        return specialiteRepository.findAll();
    }

    @Override
    public List<Specialite> findAll(Sort sort){
        return specialiteRepository.findAll(sort);
    }

    @Override
    public Page<Specialite> findAll(Pageable pageable){
        return specialiteRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    specialiteRepository.deleteById(id);
    }

    @Override
    public void delete(Specialite specialite) {
        specialiteRepository.delete(specialite);
    }

    @Override
    public void deleteAll() {
        specialiteRepository.deleteAll();
    }

    @Override
    public long count() {
        return specialiteRepository.count();
    }

}