package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.InfluencerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class InfluencerController {

    @Autowired
    private InfluencerService influencerService;

    //Add your APIs here.
}