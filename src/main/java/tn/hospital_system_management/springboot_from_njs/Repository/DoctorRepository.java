package tn.hospital_system_management.springboot_from_njs.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.hospital_system_management.springboot_from_njs.model.Doctor;

import java.util.Optional;

public interface DoctorRepository extends MongoRepository<Doctor, String> {
    Optional<Doctor> findByDoctorRegistrationNumber(int doctorRegNumber);
}
