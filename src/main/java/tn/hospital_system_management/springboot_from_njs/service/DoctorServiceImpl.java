package tn.hospital_system_management.springboot_from_njs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import tn.hospital_system_management.springboot_from_njs.Repository.DoctorRepository;
import tn.hospital_system_management.springboot_from_njs.model.Doctor;

import java.util.List;
import java.util.Optional;

@Component
public class DoctorServiceImpl implements DoctorService{
    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Doctor create(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public int newRegNumber() {
        return doctorRepository.findAll(Sort.by(Sort.Direction.DESC,"doctorRegistrationNumber")).get(0).getDoctorRegistrationNumber()+1;
    }

    @Override
    public Doctor getDoctorByRegNumber(int regNumber) {
        Optional<Doctor> doctorOptional = doctorRepository.findByDoctorRegistrationNumber(regNumber);
        if (doctorOptional.isPresent()) {
            Doctor doctor = doctorOptional.get();
            return doctor;

        }
        else return null;// we need to handle Patient Not Found Exception
    }

    @Override
    public List<Doctor> getAll() {
        return doctorRepository.findAll();
    }

    @Override
    public int count() {
        return doctorRepository.findAll().size();
    }
}
