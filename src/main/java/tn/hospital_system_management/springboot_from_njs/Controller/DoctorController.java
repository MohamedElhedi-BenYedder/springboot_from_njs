package tn.hospital_system_management.springboot_from_njs.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.hospital_system_management.springboot_from_njs.model.Doctor;
import tn.hospital_system_management.springboot_from_njs.service.DoctorServiceImpl;
import tn.hospital_system_management.springboot_from_njs.util.Name;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
    @Autowired
    DoctorServiceImpl doctorService;
    @GetMapping("/getAll")
    public List<Doctor> getAll(){

        return doctorService.getAll();
    }
    @PostMapping("/register")
    public Doctor create(@RequestBody @Valid Doctor doctor) {
        return doctorService.create(doctor);
    }
    @GetMapping("/getNewRegNumber")
    public  int getNewRegNumber()  {
        return doctorService.newRegNumber();}
    @GetMapping("/getByRegNumber/{regNumber}")
    public Doctor getByRegNumber(@PathVariable int regNumber )
    {
        return doctorService.getDoctorByRegNumber(regNumber);
    }
    @GetMapping("/count")
    public int count()
    {
        return doctorService.count();
    }
}
