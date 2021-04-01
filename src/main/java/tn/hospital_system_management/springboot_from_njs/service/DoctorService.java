package tn.hospital_system_management.springboot_from_njs.service;

import tn.hospital_system_management.springboot_from_njs.model.Doctor;


import java.util.List;

public interface DoctorService {
    public Doctor create(Doctor doctor );
    public int newRegNumber() ;
    public Doctor getDoctorByRegNumber(int regNumber);
    public List<Doctor> getAll();
    public int count();

}
