package tn.hospital_system_management.springboot_from_njs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "User")
public class User {
    @Id
    String username;
    String role;
    String password;
    int registrationNumber;
}
