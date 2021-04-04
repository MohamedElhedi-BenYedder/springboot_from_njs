package tn.hospital_system_management.springboot_from_njs.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.hospital_system_management.springboot_from_njs.model.AskForAppointment;

public interface AskForAppointmentRepository extends MongoRepository<AskForAppointment,String> {
}
