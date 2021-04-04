package tn.hospital_system_management.springboot_from_njs.service;

import tn.hospital_system_management.springboot_from_njs.model.Appointment;
import tn.hospital_system_management.springboot_from_njs.model.AskForAppointment;

import java.util.List;

public interface AskForAppointmentService {
    public List<AskForAppointment> getAll();
    public AskForAppointment create(AskForAppointment askForappointment);
    public AskForAppointment update(AskForAppointment askForappointment);
    public int newRegNumber();

}
