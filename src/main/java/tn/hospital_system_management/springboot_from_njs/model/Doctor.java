package tn.hospital_system_management.springboot_from_njs.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.hospital_system_management.springboot_from_njs.util.Name;
import tn.hospital_system_management.springboot_from_njs.util.Qualification;
import tn.hospital_system_management.springboot_from_njs.util.TimeSlot;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "Doctor")
public class Doctor {
    private int doctorRegistrationNumber;
    private Name name;
    private String gender;
    private String dob; // Date Of birth
    private String address;
    private String city;
    private String district;
    private String  nic;
    private String maritalStatus;
    private int contactNumber;
    private String email;
    private String doctorType;
    private int  SLMCRegNo;
    private Qualification primaryQualification;
    private Qualification postGradQualification;
    private List<TimeSlot> doctorAvailability;
}
