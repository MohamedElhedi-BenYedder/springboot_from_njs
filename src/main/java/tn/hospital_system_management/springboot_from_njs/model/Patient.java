package tn.hospital_system_management.springboot_from_njs.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import tn.hospital_system_management.springboot_from_njs.util.Guardian;
import tn.hospital_system_management.springboot_from_njs.util.Name;
import tn.hospital_system_management.springboot_from_njs.util.Qualification;

import java.util.Date;

@Data
@Document("Patient")
public class Patient {
    public int PatientRegistrationNumber;
    public Name name;
    public String gender;
    public String dob; // Date Of birth
    public String address;
    public String city;
    public String district;
    public String  nic;
    public String maritalStatus;
    public int contactNumber;
    public String email;
    public Guardian guardian;

}
