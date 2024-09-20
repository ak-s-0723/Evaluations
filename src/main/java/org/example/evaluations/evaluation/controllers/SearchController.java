package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.OpenSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SearchController {

    @Autowired
    private OpenSearchService openSearchService;

     //Add your API here
}
