package com.example.ipmhopital.repository;



import com.example.ipmhopital.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository  extends JpaRepository<Roles, Integer> {
}
