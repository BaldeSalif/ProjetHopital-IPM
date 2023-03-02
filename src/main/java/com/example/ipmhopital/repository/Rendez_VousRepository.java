package com.example.ipmhopital.repository;

import com.example.ipmhopital.models.Rendez_Vous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rendez_VousRepository  extends JpaRepository<Rendez_Vous, Integer> {
}
