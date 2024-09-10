package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.IRefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RefundController {

    @Autowired
    private IRefundService refundService;

    //Add your APIs here
}
