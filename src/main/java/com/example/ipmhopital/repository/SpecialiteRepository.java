package com.example.ipmhopital.repository;

import com.example.ipmhopital.models.Specialite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialiteRepository extends JpaRepository<Specialite,Integer> {
}
