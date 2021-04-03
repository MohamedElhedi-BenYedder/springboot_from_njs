package tn.hospital_system_management.springboot_from_njs.service;


import tn.hospital_system_management.springboot_from_njs.model.Appointment;

import java.util.Date;
import java.util.List;

public interface AppointmentService {
    public List<Appointment> getAll();
    public Appointment create(Appointment appointment);
    public int newRegNumber();
    public List<Appointment> getByDoctorAtDate(int doctorRegistrationNumber , Date date);
}
