package com.example.ipmhopital.services;

import com.example.ipmhopital.models.Act_Medical;
import com.example.ipmhopital.models.Rendez_Vous;

import java.util.Date;

public interface Personnels_MedicalService {
/************************* Medecin **************/
    //consulter son historique de rendez vous
    Rendez_Vous  historyRv(int idrv);
    // annuler un rendez vous
    void deleteRendezVous(int idrv);

// reporter un rendez vous
    void updateRendezVous(int idrv);

    // définir sa disponibilite
     void saveDisponibilite(int idPersonnMedic, Date dateDebu, Date dateFin);


     // Creer un dossier medical
    void  saveAct_Medical(Act_Medical actMedical, int idPatient, int idPersonnMedic);

    //rechercher un dossier medical
     Act_Medical  getAct_Medical(int idAct_Medical);

     //mettre a jour un dossier medical
    void  updateAct_Medical(int idAct_Medical);

    // gerer sa disponibilite  pour les horaires de rendez vous;

    void updateDiponibilite(int idDisp,int idPersonnMedic, int idrv);

}
