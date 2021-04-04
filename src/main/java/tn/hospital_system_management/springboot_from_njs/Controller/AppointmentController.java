package tn.hospital_system_management.springboot_from_njs.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.hospital_system_management.springboot_from_njs.model.Appointment;
import tn.hospital_system_management.springboot_from_njs.service.AppointmentServiceImpl;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {
    @Autowired
    AppointmentServiceImpl appointmentService;
    @GetMapping("/getAll")
    public List<Appointment> getAll(){
        return appointmentService.getAll();
    }
    @PostMapping("/scheduleAppointment")
    public Appointment create(@RequestBody @Valid Appointment appointment)
    {
        return appointmentService.create(appointment);
    }
    @GetMapping("/getNewNumber")
    public int newNumber(){return appointmentService.newRegNumber();}
    @GetMapping("/getByDoctor@Date/{doctorRegistrationNumber}/{Date}")
    public List<Appointment> getByDoctorAtDate(@PathVariable("doctorRegistrationNumber") int doctorRegistrationNumber ,@PathVariable("Date") String date  )
    {
        return appointmentService.getByDoctorAtDate(doctorRegistrationNumber,date);
    }
}
