package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.IDeployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/install")
public class InstallController {

    @Autowired
    private IDeployService deployService;

    //Implement your API here
}
