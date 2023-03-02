package com.example.ipmhopital.repository;

import com.example.ipmhopital.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository  extends JpaRepository<Patient, Integer> {
}
