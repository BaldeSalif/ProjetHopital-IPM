package com.example.ipmhopital.repository;


import com.example.ipmhopital.models.Act_Medical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Act_MedicalRepository  extends JpaRepository<Act_Medical,Integer> {
}
