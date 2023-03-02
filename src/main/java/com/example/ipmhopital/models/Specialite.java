package com.example.ipmhopital.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Specialite  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id_Specialite;
    private  String libelle_Specialite;

    @OneToMany(mappedBy = "specialite")
    private Collection<Personnels_Medical> personnelsMedicals;
}
