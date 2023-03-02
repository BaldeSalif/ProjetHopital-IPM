package com.example.ipmhopital.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id_Patient;
    private  String prenom;
    private  String nom;
    private  String adresse;
    private  String telephone;
    @OneToOne(mappedBy = "patient")
    private Rendez_Vous rendezVous;

    @ManyToOne()
    @JoinColumn(name ="idPersonnMedical",nullable = false,referencedColumnName = "id_PersonnMedical")
    private Personnels_Medical personnelsMedical;

    @OneToOne(mappedBy = "patient")
    private Act_Medical actMedical;

}
