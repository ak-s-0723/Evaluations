package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmazonProductController {

    @Autowired
    private IProductService amazonProductService;

    //Add your APIs here.
}
