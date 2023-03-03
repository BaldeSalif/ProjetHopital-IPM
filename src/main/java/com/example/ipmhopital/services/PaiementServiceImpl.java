package com.example.ipmhopital.services;

import com.example.ipmhopital.models.Paiement;
import com.example.ipmhopital.repository.PaiementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class PaiementServiceImpl implements PaiementService {

    @Autowired
    private PaiementRepository paiementRepository;

    @Override
    public Paiement save(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Optional<Paiement> find(Long id) {
        return paiementRepository.findById(id);
    }

    @Override
    public List<Paiement> findAll() {
        return paiementRepository.findAll();
    }

    @Override
    public List<Paiement> findAll(Sort sort){
        return paiementRepository.findAll(sort);
    }

    @Override
    public Page<Paiement> findAll(Pageable pageable){
        return paiementRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
    paiementRepository.deleteById(id);
    }

    @Override
    public void delete(Paiement paiement) {
        paiementRepository.delete(paiement);
    }

    @Override
    public void deleteAll() {
        paiementRepository.deleteAll();
    }

    @Override
    public long count() {
        return paiementRepository.count();
    }

}