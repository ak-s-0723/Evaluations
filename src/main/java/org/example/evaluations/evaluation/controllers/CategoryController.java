package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    //Add your APIs here.
}
