package tn.hospital_system_management.springboot_from_njs.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.hospital_system_management.springboot_from_njs.util.Name;

import java.util.Date;
@Data
@Document("AskForAppointment")
public class AskForAppointment {
    int appointmentNumber;
    int doctorRegistrationNumber;
    int patientRegistrationNumber;
    Name name;
    String gender;
    int contactNumber;
    String NIC;
    String city;
    String district;
    String timeSolt;
    String appointmentDate;
    String dateCreated;

}
