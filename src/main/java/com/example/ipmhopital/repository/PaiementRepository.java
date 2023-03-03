package com.example.ipmhopital.repository;

import com.example.ipmhopital.models.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
