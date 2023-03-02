package com.example.ipmhopital.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Disponibilite_medecin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id_disponibilite;
    private Date date_Debut;
    private  Date date_Fin;

    @ManyToOne()
    @JoinColumn(name = "idPersonnMedical",nullable = true,referencedColumnName = "id_PersonnMedical")
    private  Personnels_Medical personnelsMedical;

    @ManyToOne()
    @JoinColumn(name = "idrv",nullable = true,referencedColumnName = "id_rv")
    private Rendez_Vous rendezVous;


}
