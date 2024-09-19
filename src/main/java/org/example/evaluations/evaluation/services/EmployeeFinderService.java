package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.dtos.SortParam;
import org.example.evaluations.evaluation.models.Employee;
import org.example.evaluations.evaluation.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeFinderService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Page<Employee> findEmployees(String department, Integer pageNumber, Integer pageSize, List<SortParam> sortParams) {
        return null;
    }
}
