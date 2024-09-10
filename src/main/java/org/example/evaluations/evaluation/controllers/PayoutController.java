package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.IPayoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayoutController {

    @Autowired
    private IPayoutService payoutService;

    //Add your API here
}
