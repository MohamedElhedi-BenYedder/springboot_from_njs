package tn.hospital_system_management.springboot_from_njs.util;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import lombok.Data;


@Data
public class Name {
    public String firstName;
    public String lastName;
    public String FullName(){ return firstName+" "+lastName;}
}
