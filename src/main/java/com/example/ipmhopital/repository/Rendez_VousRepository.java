package com.example.ipmhopital.repository;

import com.example.ipmhopital.models.Rendez_Vous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface Rendez_VousRepository extends JpaRepository<Rendez_Vous, Long> {
    @Query("select  r from Rendez_Vous  r where r.personnelsMedical.prenom=:NomMed")
    List<Rendez_Vous> findRvByNomMed(@Param("NomMed") String NomMed);
}
