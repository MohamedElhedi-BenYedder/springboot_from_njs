package tn.hospital_system_management.springboot_from_njs.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "User")
public class User {
    @Id
    String username;
    String role;
    int registrationNumber;
    String password;
}