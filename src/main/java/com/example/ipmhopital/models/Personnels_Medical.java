package com.example.ipmhopital.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personnels_Medical implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_PersonnMedical;
    private String nom;
    private  String prenom;
    private String adresse;
    @Column(unique = true)
    private  String email;
    private  String password;

    @ManyToMany
    @JoinTable( name = "PersonnMedical_Roles_Associations",
        joinColumns = @JoinColumn( name = "id_PersonnMedical" ),
        inverseJoinColumns = @JoinColumn( name = "id_Role" ) )
    private List<Roles> roles = new ArrayList<>();

    @OneToMany(mappedBy = "personnelsMedical")
    private Collection <Disponibilite_medecin> disponibiliteMedecins;
    @OneToMany(mappedBy = "personnelsMedical")
    private  Collection<Patient> patients;

    @OneToMany(mappedBy = "personnelsMedical")
    private  Collection<Act_Medical> actMedicals;

    @OneToMany(mappedBy = "personnelsMedical")
    private  Collection<Rendez_Vous> rendezVous;

    @ManyToOne()
    @JoinColumn(name = "idservices",nullable = false,referencedColumnName = "id_service")
    private  Services services;

    @ManyToOne()
    @JoinColumn(name = "idSpecialite",nullable = false,referencedColumnName = "id_Specialite")
    private  Specialite specialite;



}
