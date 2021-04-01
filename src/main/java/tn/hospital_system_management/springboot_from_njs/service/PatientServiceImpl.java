package tn.hospital_system_management.springboot_from_njs.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import tn.hospital_system_management.springboot_from_njs.Repository.PatientRepository;
import tn.hospital_system_management.springboot_from_njs.model.Patient;

import java.util.List;
import java.util.Optional;


@Component
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient create(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public int newRegNumber()  {
        return patientRepository.findAll(Sort.by(Sort.Direction.DESC,"patientRegistrationNumber")).get(0).getPatientRegistrationNumber()+1;

    }

    @Override
    public Patient getPatientByRegNumber(int regNumber) {
        Optional<Patient> patientOptional = patientRepository.findByPatientRegistrationNumber(regNumber);
        if (patientOptional.isPresent()) {
            Patient patient = patientOptional.get();
            return patient;

        }
        else return null;// we need to handle Patient Not Found Exception

    }
    @Override
    public List<Patient> getAll() {
        return patientRepository.findAll();
    }

    @Override
    public int count() {
        return patientRepository.findAll().size();
    }

    @Override
    public List<Patient> searchPatientByName(String search) {
        return patientRepository.findByName_FirstNameIsLike(search);
    }
}
