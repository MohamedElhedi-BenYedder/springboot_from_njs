package tn.hospital_system_management.springboot_from_njs.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.hospital_system_management.springboot_from_njs.model.Patient;
import tn.hospital_system_management.springboot_from_njs.service.PatientServiceImpl;
import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/patient")
public class PatientController {
    @Autowired
    PatientServiceImpl patientService;
    @GetMapping("/getAll")
    public List<Patient> getAll(){

        return patientService.getAll();
    }
    @PostMapping("/register")
    public Patient create(@RequestBody @Valid Patient patient) {
        return patientService.create(patient);
    }
    @GetMapping("/getNewRegNumber")
    public  int getNewRegNumber()  {
        return patientService.newRegNumber();}
    @GetMapping("/getByRegNumber/{regNumber}")
    public Patient getByRegNumber(@PathVariable int regNumber )
    {
        return patientService.getPatientByRegNumber(regNumber);
    }
    @GetMapping("/count")
    public int countPatients()
    {
        return patientService.count();
    }
    @GetMapping("/search/{search}")
    public List<Patient> searchPatient(@PathVariable String search)
    {
        if (search == null || search.equals(""))
            return patientService.getAll();
        else  return patientService.searchPatientByName(search);
    }
}
