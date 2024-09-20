package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.ProductSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductSearchService productSearchService;

    //Add your APIs here
}
