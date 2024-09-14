package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.CreateSessionDto_;
import org.example.evaluations.implementation.dtos.SessionDto_;
import org.example.evaluations.implementation.services.ISessionService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController_ {

    @Autowired
    private ISessionService_ sessionService;

    @PostMapping("/session_")
    public SessionDto_ createSession(@RequestBody CreateSessionDto_ createSessionDto) {
        return  sessionService.createSession(createSessionDto.getSuccessUrl(),createSessionDto.getAmounts(),createSessionDto.getProductNames(),createSessionDto.getQuantities());
    }
}
