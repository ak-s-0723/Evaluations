package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;

    //Add your APIs here.
}
