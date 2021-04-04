package tn.hospital_system_management.springboot_from_njs.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.hospital_system_management.springboot_from_njs.model.Employee;
import tn.hospital_system_management.springboot_from_njs.service.EmployeeServiceImpl;

import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;
    @GetMapping("getAll")
    public List<Employee> getAll() {
        return employeeService.getAll();
    }
}
