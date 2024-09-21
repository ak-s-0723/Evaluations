package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    //Add your Apis here.
}
