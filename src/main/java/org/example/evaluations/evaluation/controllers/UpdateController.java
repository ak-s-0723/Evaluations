package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.IDeployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/update")
public class UpdateController {

    @Autowired
    private IDeployService deployService;

    //Implement your API here
}
