package tn.hospital_system_management.springboot_from_njs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.hospital_system_management.springboot_from_njs.Repository.PatientRepository;
import tn.hospital_system_management.springboot_from_njs.model.Patient;

import java.util.Random;

@Component
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;

    /**
     * create Patient
     * @param patient
     * @return
     */

    @Override
    public Patient create(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public int newRegNumber() {
        return new Random().nextInt();
    }
}
