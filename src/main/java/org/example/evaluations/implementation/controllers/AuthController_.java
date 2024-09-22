package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.LoginRequestDto_;
import org.example.evaluations.implementation.dtos.ValidateTokenRequestDto_;
import org.example.evaluations.implementation.services.AuthenticationService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController_ {

    @Autowired
    private AuthenticationService_ authenticationService;

    @PostMapping("/login_")
    public ResponseEntity<Boolean> login(@RequestBody LoginRequestDto_ loginRequestDto) {
        return authenticationService.login(loginRequestDto.getEmail(),loginRequestDto.getPassword());
    }

    @PostMapping("/validateToken_")
   public Boolean validateToken(@RequestBody ValidateTokenRequestDto_ validateTokenRequestDto) {
        return authenticationService.validateToken(validateTokenRequestDto.getEmail(),validateTokenRequestDto.getToken());
    }
}
