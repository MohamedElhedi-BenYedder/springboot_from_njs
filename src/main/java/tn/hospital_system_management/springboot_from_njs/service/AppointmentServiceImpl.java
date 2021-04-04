package tn.hospital_system_management.springboot_from_njs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import tn.hospital_system_management.springboot_from_njs.Repository.AppointmentRepository;
import tn.hospital_system_management.springboot_from_njs.model.Appointment;

import java.util.Date;
import java.util.List;

@Component
public class AppointmentServiceImpl implements AppointmentService{
    @Autowired
    AppointmentRepository appointmentRepository;


    @Override
    public List<Appointment> getAll() {
        return appointmentRepository.findAll();
    }



    @Override
    public Appointment create(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public int newRegNumber() {
        return appointmentRepository.findAll(Sort.by(Sort.Direction.DESC,"appointmentNumber")).get(0).getAppointmentNumber()+1;
    }

    @Override
    public List<Appointment> getByDoctorAtDate(int doctorRegistrationNumber, String appointmentDate) {
        return appointmentRepository.findByDoctorRegistrationNumberAndAppointmentDate(doctorRegistrationNumber,appointmentDate);
    }

    @Override
    public Appointment update(Appointment appointment) {
        return null;
    }
}
