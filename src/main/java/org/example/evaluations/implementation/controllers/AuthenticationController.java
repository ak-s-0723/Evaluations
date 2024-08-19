package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.FakeStoreLoginRequestDto;
import org.example.evaluations.implementation.services.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth_")
public class AuthenticationController {

    @Autowired
    private IAuthService authService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody FakeStoreLoginRequestDto fakeStoreLoginRequestDto) {
        MultiValueMap<String, String> headers = authService.login(fakeStoreLoginRequestDto);
        if(headers!=null)
            return new ResponseEntity<>("login successful",headers, HttpStatus.OK);
        else
            return new ResponseEntity<>("login failed",headers,HttpStatus.UNAUTHORIZED);
    }
}
