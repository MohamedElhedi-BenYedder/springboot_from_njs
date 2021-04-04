package tn.hospital_system_management.springboot_from_njs.service;

import tn.hospital_system_management.springboot_from_njs.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee create(Employee employee);
    public Employee getByRegNumber(int RegNumber);
    public List<Employee> getAll();
}
