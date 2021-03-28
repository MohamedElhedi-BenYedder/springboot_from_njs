package tn.hospital_system_management.springboot_from_njs.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.hospital_system_management.springboot_from_njs.model.Patient;
import tn.hospital_system_management.springboot_from_njs.service.PatientServiceImpl;
import tn.hospital_system_management.springboot_from_njs.util.NewRegNumber;

import javax.validation.Valid;

import static java.lang.Math.abs;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/patient")
public class PatientController {
    @Autowired
    PatientServiceImpl patientService;
    @PostMapping("/register")
    public Patient create(@RequestBody @Valid Patient patient) {
        return patientService.create(patient);
    }
    @GetMapping("/getNewRegNumber")
    public NewRegNumber getNewRegNumber(){return new NewRegNumber(abs(patientService.newRegNumber()));}
}
