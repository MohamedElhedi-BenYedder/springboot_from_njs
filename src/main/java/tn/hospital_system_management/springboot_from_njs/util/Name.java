package tn.hospital_system_management.springboot_from_njs.util;

import lombok.Data;

@Data
public class Name {
    public String firstName;
    public String lastName;
    public String getFullName(){ return firstName+" "+lastName;}
}
