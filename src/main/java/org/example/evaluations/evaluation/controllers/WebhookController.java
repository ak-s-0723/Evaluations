package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.services.IWebhookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebhookController {

    @Autowired
    private IWebhookService webhookService;

    //Add your APIs here
}
