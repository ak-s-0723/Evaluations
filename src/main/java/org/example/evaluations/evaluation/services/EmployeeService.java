package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.models.Employee;
import org.example.evaluations.evaluation.repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee getEmployeeDetails(Long empId) {
        return null;
    }
}
