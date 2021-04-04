package tn.hospital_system_management.springboot_from_njs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.hospital_system_management.springboot_from_njs.Repository.EmployeeRepository;
import tn.hospital_system_management.springboot_from_njs.model.Employee;

import java.util.List;

@Component
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee create(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getByRegNumber(int regNumber) {
        return employeeRepository.findByRegNumber(regNumber);
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }
}
