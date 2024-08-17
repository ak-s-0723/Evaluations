package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contractualEmployee")
public class ContractualEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    //Implement APIs here...
}