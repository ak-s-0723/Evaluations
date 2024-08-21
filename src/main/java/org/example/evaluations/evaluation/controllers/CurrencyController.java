package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    @Autowired
    private ICurrencyService currencyService;

    //Add your APIs here
}
