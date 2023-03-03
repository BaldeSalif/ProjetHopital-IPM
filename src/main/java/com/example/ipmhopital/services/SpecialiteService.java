package com.example.ipmhopital.services;

import com.example.ipmhopital.models.Specialite;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface SpecialiteService {

    Specialite save(Specialite specialite);

    Optional<Specialite> find(Long id);

    List<Specialite> findAll();

    List<Specialite> findAll(Sort sort);

    Page<Specialite> findAll(Pageable pageable);

    void delete(Long id);

    void delete(Specialite specialite);

    void deleteAll();

    long count();

}