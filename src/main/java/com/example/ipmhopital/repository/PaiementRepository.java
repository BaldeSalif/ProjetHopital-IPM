package com.example.ipmhopital.repository;

import com.example.ipmhopital.models.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementRepository  extends JpaRepository<Paiement, Integer> {
}
