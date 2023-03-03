package com.example.ipmhopital.repository;

import com.example.ipmhopital.models.Disponibilite_medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface Disponibilite_MedcinRepository  extends JpaRepository<Disponibilite_medecin,Integer> {
}
