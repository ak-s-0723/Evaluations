package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.UserSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserSearchController {

    @Autowired
    private UserSearchService userSearchService;

    //Add your APIs here
}
