package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.NearbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/nearby/restaurants")
public class NearbyController {

    @Autowired
    private NearbyService nearbyService;

    //Add your APIs here.
}
