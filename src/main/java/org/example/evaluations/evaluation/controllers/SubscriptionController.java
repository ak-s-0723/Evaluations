package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.ISubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriptionController {

    @Autowired
    private ISubscriptionService subscriptionService;

    //Add your API here
}
