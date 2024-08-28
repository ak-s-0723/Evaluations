package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.LoginRequest;
import org.example.evaluations.implementation.dtos.LoginResponse;
import org.example.evaluations.implementation.dtos.SignupRequest;
import org.example.evaluations.implementation.dtos.SignupResponse;
import org.example.evaluations.implementation.exceptions.BadCredentialsException;
import org.example.evaluations.implementation.exceptions.UserNotSignedUpException;
import org.example.evaluations.implementation.services.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth_")
public class AuthController_ {

    @Autowired
    private IAuthService authService;

    @PostMapping("/signup")
    public SignupResponse signup(@RequestBody SignupRequest signupRequest) {
       return authService.signup(signupRequest);
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest) throws BadCredentialsException, UserNotSignedUpException {
        try {
            return authService.login(loginRequest);
        }catch (BadCredentialsException exception) {
            throw  exception;
        }catch (UserNotSignedUpException exception) {
            throw exception;
        }
    }
}


//{
//        "email" : "ak@ak",
//        "password" : "ak",
//        "firstName" : "a",
//        "lastName" : "k",
//        "address" : "akakakaka",
//        "phoneNumber" : "999999"
//}
