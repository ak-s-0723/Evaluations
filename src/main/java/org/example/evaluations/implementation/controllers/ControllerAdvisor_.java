package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.exceptions.BadCredentialsException;
import org.example.evaluations.implementation.exceptions.UserNotSignedUpException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvisor_ {

    @ExceptionHandler({BadCredentialsException.class, UserNotSignedUpException.class})
    public ResponseEntity<String> handleBadRequests(Exception exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
