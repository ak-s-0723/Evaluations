package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.dtos.LoginRequest;
import org.example.evaluations.implementation.dtos.LoginResponse;
import org.example.evaluations.implementation.dtos.SignupRequest;
import org.example.evaluations.implementation.dtos.SignupResponse;
import org.example.evaluations.implementation.exceptions.BadCredentialsException;
import org.example.evaluations.implementation.exceptions.UserNotSignedUpException;

public interface IAuthService {
    SignupResponse signup(SignupRequest request);

    LoginResponse login(LoginRequest loginRequest) throws UserNotSignedUpException, BadCredentialsException;
}
