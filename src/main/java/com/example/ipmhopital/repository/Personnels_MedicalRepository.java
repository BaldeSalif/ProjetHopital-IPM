package com.example.ipmhopital.repository;

import com.example.ipmhopital.models.Personnels_Medical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface Personnels_MedicalRepository extends JpaRepository<Personnels_Medical, Long> {
}
