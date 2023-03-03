package com.example.ipmhopital.repository;

import com.example.ipmhopital.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
