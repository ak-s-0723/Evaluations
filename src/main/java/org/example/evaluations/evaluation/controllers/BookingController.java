package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class BookingController {

    @Autowired
    private IBookingService bookingService;

    //Add APIs here

}
