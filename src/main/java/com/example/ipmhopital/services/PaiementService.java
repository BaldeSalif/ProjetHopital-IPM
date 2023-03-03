package com.example.ipmhopital.services;

import com.example.ipmhopital.models.Paiement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface PaiementService {

    Paiement save(Paiement paiement);

    Optional<Paiement> find(Long id);

    List<Paiement> findAll();

    List<Paiement> findAll(Sort sort);

    Page<Paiement> findAll(Pageable pageable);

    void delete(Long id);

    void delete(Paiement paiement);

    void deleteAll();

    long count();

}