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
public class Act_Medical  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id_ActMedical;
    private String nom_hopital;
    @Column(unique = true)
    private  int numero_dossier;
    @Column(unique = true)
    private  int code_Patient;

    @ManyToOne()
    @JoinColumn(name = "idPersonnMedical",nullable = false,referencedColumnName = "id_PersonnMedical")
    private  Personnels_Medical personnelsMedical;

    @OneToOne()
    @JoinColumn(name = "idPatient",nullable = false,referencedColumnName = "id_Patient")
    private Patient patient;

}
