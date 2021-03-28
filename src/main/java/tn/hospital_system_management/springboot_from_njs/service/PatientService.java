package tn.hospital_system_management.springboot_from_njs.service;

import tn.hospital_system_management.springboot_from_njs.model.Patient;

public interface PatientService {
    public Patient create(Patient patient);
    public int newRegNumber();
}
