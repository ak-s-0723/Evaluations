package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.SignupRequestDto_;
import org.example.evaluations.implementation.exceptions.UserAlreadyExistsException_;
import org.example.evaluations.implementation.models.Client_;
import org.example.evaluations.implementation.services.SignupService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/signup_")
public class SignupController_ {

    @Autowired
    private SignupService_ signupService;

    @PostMapping
    public Client_ perform(@RequestBody SignupRequestDto_ signupRequestDto) throws UserAlreadyExistsException_ {
       return signupService.signup(signupRequestDto.getEmail(),signupRequestDto.getPassword(),signupRequestDto.getName(),signupRequestDto.getPhoneNumber());
    }


    @ExceptionHandler(UserAlreadyExistsException_.class)
    public String handleExceptions(UserAlreadyExistsException_ exception) {
        return exception.getMessage();
    }
}
