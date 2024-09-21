package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.exceptions.UserNotFoundException_;
import org.example.evaluations.implementation.models.Client_;
import org.example.evaluations.implementation.services.ClientService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client_")
public class ClientController_ {

    @Autowired
    private ClientService_ clientService;

    @GetMapping("/id/{id}")
    public Client_ getClientFromId(@PathVariable  Long id) throws UserNotFoundException_ {
        return clientService.getClientFromId(id);
    }


    @GetMapping("/email/{email}")
    public Client_ getClientFromEmail(@PathVariable String email) throws UserNotFoundException_ {
        return clientService.getClientFromEmail(email);
    }

    @ExceptionHandler(UserNotFoundException_.class)
    private String handleExceptions(Exception exception) {
        return exception.getMessage();
    }
}
