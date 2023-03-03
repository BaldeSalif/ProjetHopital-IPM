package com.example.ipmhopital.services;

import com.example.ipmhopital.models.Disponibilite_medecin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface Disponibilite_medecinService {

    Disponibilite_medecin save(Disponibilite_medecin disponibilite_medecin);

    Optional<Disponibilite_medecin> find(Long id);

    List<Disponibilite_medecin> findAll();

    List<Disponibilite_medecin> findAll(Sort sort);

    Page<Disponibilite_medecin> findAll(Pageable pageable);

    void delete(Long id);

    void delete(Disponibilite_medecin disponibilite_medecin);

    void deleteAll();

    long count();

}