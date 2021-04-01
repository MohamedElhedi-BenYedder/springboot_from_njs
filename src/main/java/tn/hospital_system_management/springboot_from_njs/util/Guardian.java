package tn.hospital_system_management.springboot_from_njs.util;

import lombok.Data;

@Data
public class Guardian {
   public String guardianType;
   public String firstName;
   public String lastName;
   public String gender;
   public String NIC;
   public int contactNumber;
}
