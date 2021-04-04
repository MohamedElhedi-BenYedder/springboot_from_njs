package tn.hospital_system_management.springboot_from_njs.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.hospital_system_management.springboot_from_njs.model.Appointment;
import tn.hospital_system_management.springboot_from_njs.model.AskForAppointment;
import tn.hospital_system_management.springboot_from_njs.service.AppointmentServiceImpl;
import tn.hospital_system_management.springboot_from_njs.service.AskForAppointmentServiceImpl;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/askforappointment")
public class AskForAppointmentController {
    @Autowired
    AskForAppointmentServiceImpl askForappointmentService;
    @GetMapping("/getAll")
    public List<AskForAppointment> getAll(){
        return askForappointmentService.getAll();
    }
    @PostMapping("/scheduleAppointment")
    public AskForAppointment create(@RequestBody @Valid AskForAppointment askForappointment)
    {
        return askForappointmentService.create(askForappointment);
    }
    @GetMapping("/getNewNumber")
    public int newNumber(){return askForappointmentService.newRegNumber();}


}
