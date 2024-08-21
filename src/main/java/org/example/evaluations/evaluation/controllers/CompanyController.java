package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {

    @Autowired
    private IStockService companyService;

    //Add your APIs here
}
