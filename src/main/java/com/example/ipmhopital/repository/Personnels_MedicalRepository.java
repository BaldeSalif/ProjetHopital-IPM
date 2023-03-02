package com.example.ipmhopital.repository;

import com.example.ipmhopital.models.Personnels_Medical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Personnels_MedicalRepository extends JpaRepository<Personnels_Medical,Integer> {
}
