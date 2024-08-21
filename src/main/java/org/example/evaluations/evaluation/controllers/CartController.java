package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private ICartService cartService;

    //Add your APIs here
}
