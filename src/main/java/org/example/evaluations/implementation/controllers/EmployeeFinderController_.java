package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.EmployeeFinderRequestDto_;
import org.example.evaluations.implementation.models.Employee_;
import org.example.evaluations.implementation.services.EmployeeFinderService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeFinderController_ {

    @Autowired
    private EmployeeFinderService_ employeeFinderService;

    @PostMapping("/employeeFinder_")
    public Page<Employee_> findEmployees(@RequestBody EmployeeFinderRequestDto_ employeeFinderRequestDto) {
        return employeeFinderService.findEmployees(employeeFinderRequestDto.getDepartment(), employeeFinderRequestDto.getPageNumber(), employeeFinderRequestDto.getPageSize(), employeeFinderRequestDto.getSortParamList());
    }
}
