package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.EmployeeFinderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeFinderController {

    @Autowired
    private EmployeeFinderService employeeFinderService;

    //Add your APIs here
}
