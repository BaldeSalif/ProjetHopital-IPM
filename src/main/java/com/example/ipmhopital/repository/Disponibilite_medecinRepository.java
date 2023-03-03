package com.example.ipmhopital.repository;

import com.example.ipmhopital.models.Disponibilite_medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Disponibilite_medecinRepository extends JpaRepository<Disponibilite_medecin, Long> {
}
