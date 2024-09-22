package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private AuthenticationService authenticationService;

    // Implement your APIs here.
}
