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
public class Paiement  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id_paiement;
    private  double prix_consultation;
    private boolean statut_paiement;
    @ManyToOne()
    @JoinColumn(name = "idrv",nullable = false,referencedColumnName = "id_rv")
    private  Rendez_Vous rendezVous;


}
