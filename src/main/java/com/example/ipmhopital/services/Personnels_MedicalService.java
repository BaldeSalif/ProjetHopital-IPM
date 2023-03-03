package com.example.ipmhopital.services;

import com.example.ipmhopital.models.Personnels_Medical;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface Personnels_MedicalService {

    Personnels_Medical save(Personnels_Medical personnels_medical);

    Optional<Personnels_Medical> find(Long id);

    List<Personnels_Medical> findAll();

    List<Personnels_Medical> findAll(Sort sort);

    Page<Personnels_Medical> findAll(Pageable pageable);

    void delete(Long id);

    void delete(Personnels_Medical personnels_medical);

    void deleteAll();

    long count();

}