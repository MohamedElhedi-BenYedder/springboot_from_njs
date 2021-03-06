package tn.hospital_system_management.springboot_from_njs.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Room")
public class Room {
    private int roomNumber;
    private String type;
    private String status;
}
