package com.example.ipmhopital.repository;

import com.example.ipmhopital.models.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SpecialiteRepository extends JpaRepository<Specialite, Long> {
}
