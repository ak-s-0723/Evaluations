package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SignupController {

    @Autowired
    private SignupService signupService;

    //Add your API here
}
