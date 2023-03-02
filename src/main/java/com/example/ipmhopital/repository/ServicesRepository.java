package com.example.ipmhopital.repository;

import com.example.ipmhopital.models.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesRepository  extends JpaRepository<Services, Integer> {
}
