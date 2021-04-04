package tn.hospital_system_management.springboot_from_njs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import tn.hospital_system_management.springboot_from_njs.Repository.AppointmentRepository;
import tn.hospital_system_management.springboot_from_njs.Repository.AskForAppointmentRepository;
import tn.hospital_system_management.springboot_from_njs.model.Appointment;
import tn.hospital_system_management.springboot_from_njs.model.AskForAppointment;

import java.util.List;
@Component
public class AskForAppointmentServiceImpl implements AskForAppointmentService {
    @Autowired
    AskForAppointmentRepository askForappointmentRepository;


    @Override
    public List<AskForAppointment> getAll() {
        return askForappointmentRepository.findAll();
    }



    @Override
    public AskForAppointment create(AskForAppointment askForappointment) {
        return askForappointmentRepository.save(askForappointment);
    }

    @Override
    public int newRegNumber() {
        return askForappointmentRepository.findAll(Sort.by(Sort.Direction.DESC,"appointmentNumber")).get(0).getAppointmentNumber()+1;
    }

    @Override
    public AskForAppointment update(AskForAppointment askForappointment) {
        return null;
    }
}
