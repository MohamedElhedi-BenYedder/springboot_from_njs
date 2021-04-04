package tn.hospital_system_management.springboot_from_njs.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.hospital_system_management.springboot_from_njs.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,String> {
    Employee findByRegNumber(int regNumber);
}
