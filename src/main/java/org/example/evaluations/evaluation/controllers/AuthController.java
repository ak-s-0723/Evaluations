package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private IAuthService authService;

    //Add APIs here.
}

