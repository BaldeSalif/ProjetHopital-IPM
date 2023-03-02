package com.example.ipmhopital.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor

public class Services  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_service ;
    private  String NomService;

    @OneToMany(mappedBy = "services")
    private Collection<Rendez_Vous>rendezVous;

    @OneToMany(mappedBy = "services")
    private Collection<Personnels_Medical> personnelsMedicals;


}
