package tn.hospital_system_management.springboot_from_njs.service;

import org.json.JSONException;
import org.json.JSONObject;
import tn.hospital_system_management.springboot_from_njs.model.Patient;

import java.util.List;

public interface PatientService {
    public Patient create(Patient patient);
    public int newRegNumber() ;
    public Patient getPatientByRegNumber(int regNumber);
    public List<Patient> searchPatientByName(String search);
    List<Patient> getAll();
    int count();
}
