package com.example.ipmhopital.services;

import com.example.ipmhopital.models.Act_Medical;
import com.example.ipmhopital.models.Rendez_Vous;

import java.util.Date;

public class Personnels_MedicalServiceImpl implements  Personnels_MedicalService{
    @Override
    public Rendez_Vous historyRv(int idrv) {
        return null;
    }

    @Override
    public void deleteRendezVous(int idrv) {

    }

    @Override
    public void updateRendezVous(int idrv) {

    }

    @Override
    public void saveDisponibilite(int idPersonnMedic, Date dateDebu, Date dateFin) {

    }

    @Override
    public void saveAct_Medical(Act_Medical actMedical, int idPatient, int idPersonnMedic) {

    }

    @Override
    public Act_Medical getAct_Medical(int idAct_Medical) {
        return null;
    }

    @Override
    public void updateAct_Medical(int idAct_Medical) {

    }

    @Override
    public void updateDiponibilite(int idDisp, int idPersonnMedic, int idrv) {

    }
}
