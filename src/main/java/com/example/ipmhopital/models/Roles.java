package com.example.ipmhopital.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Roles implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Role;
    @Column(unique = true)
    private String authority;
    private String description;
    @ManyToMany
    @JoinTable( name = "PersonnMedical_Roles_Associations",
        joinColumns = @JoinColumn( name = "id_Role" ),
        inverseJoinColumns = @JoinColumn( name = "id_PersonnMedical" ) )
    private List<Personnels_Medical> personnelsMedicals = new ArrayList<>();
}
