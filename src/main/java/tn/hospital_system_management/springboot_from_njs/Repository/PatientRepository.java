package tn.hospital_system_management.springboot_from_njs.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.hospital_system_management.springboot_from_njs.model.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientRepository extends MongoRepository<Patient, String> {
    Optional<Patient> findByPatientRegistrationNumber(int patientRegNumber);
    List<Patient> findByName_FirstNameIsLike(String search);


}
