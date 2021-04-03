package tn.hospital_system_management.springboot_from_njs.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.hospital_system_management.springboot_from_njs.model.Appointment;

import java.util.Date;
import java.util.List;

public interface AppointmentRepository extends MongoRepository<Appointment, String> {
    List<Appointment> findByDoctorRegistrationNumberAndAppointmentDate(int doctorRegistrationNumber, Date appointmentDate);
}
