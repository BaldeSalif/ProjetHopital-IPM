package com.example.ipmhopital.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rendez_Vous  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_rv;
    private Date date_rv;

    @OneToMany (mappedBy ="rendezVous" )
    private Collection<Disponibilite_medecin> disponibiliteMedecins;

    @OneToMany(mappedBy = "rendezVous")
    private Collection<Paiement> paiements;
    @OneToOne()
    @JoinColumn(name = "idPatient",nullable = false,referencedColumnName = "id_Patient")
    private Patient patient;

    @ManyToOne()
    @JoinColumn(name = "idPersonnMedical",nullable = false,referencedColumnName = "id_PersonnMedical")
    private Personnels_Medical personnelsMedical;

    @ManyToOne()
    @JoinColumn(name = "idservice",nullable = true,referencedColumnName = "id_service")
    private Services services;




}
