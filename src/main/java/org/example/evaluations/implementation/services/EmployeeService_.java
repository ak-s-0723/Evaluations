package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Employee_;
import org.example.evaluations.implementation.repos.EmployeeRepo_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService_ {

    @Autowired
    private EmployeeRepo_ employeeRepo;

    public Employee_ getEmployeeDetails(Long empId) {
        Optional<Employee_> employeeOptional = employeeRepo.findById(empId);
        return employeeOptional.get();
    }
}
