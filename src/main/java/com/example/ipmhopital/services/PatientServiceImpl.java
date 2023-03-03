package com.example.ipmhopital.services;

import com.example.ipmhopital.models.Patient;
import com.example.ipmhopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {
/*
    @Autowired
    private  PatientRepository patientRepository;

  @Autowired
    private  PatientService patientService;


    @Override
    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Optional<Patient> find(Long id) {
        return patientRepository.findById(id);
    }

    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }





    @Override
    public void delete(Long id) {
    patientService.delete(id);
    }



    @Override
    public long count() {
        return patientRepository.count();
    }
*/

}
