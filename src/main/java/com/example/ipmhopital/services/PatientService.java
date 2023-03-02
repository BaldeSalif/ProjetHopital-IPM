package com.example.ipmhopital.services;

import com.example.ipmhopital.models.Act_Medical;
import com.example.ipmhopital.models.Patient;
import com.example.ipmhopital.models.Rendez_Vous;

public interface PatientService {
    void saveRendezVous(Rendez_Vous rendezVous, int idPersonnMedic, int idService);
    void savePaiement(double prix_consultation, int idrv);

    void updateRendezVous(int idrv);

    void deleteRendezVous(int idrv);

    Act_Medical consulterActMedic(int idAct_Medical);


}
