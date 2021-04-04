package tn.hospital_system_management.springboot_from_njs.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.hospital_system_management.springboot_from_njs.util.TimeSlot;

import java.util.Date;
@Data
@Document("Appointment")
public class Appointment {

    private int appointmentNumber ;
    private int doctorRegistrationNumber;
    private int patientRegistrationNumber;
    private TimeSlot timeSlot;
    private String appointmentDate;
    private String dateCreated;
    private String appointmentType;
    private String appointmentStatus;
    private String symptoms;
    private String disease;
    private String prescription;
}
