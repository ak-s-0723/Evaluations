package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.dtos.LoginRequest;
import org.example.evaluations.evaluation.dtos.LoginResponse;
import org.example.evaluations.evaluation.dtos.SignupRequest;
import org.example.evaluations.evaluation.dtos.SignupResponse;
import org.example.evaluations.evaluation.exceptions.BadCredentialsException;
import org.example.evaluations.evaluation.exceptions.UserNotSignedUpException;
import org.example.evaluations.evaluation.repos.AuthCredentialRepo;
import org.example.evaluations.evaluation.repos.SessionRepo;
import org.example.evaluations.evaluation.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AuthService implements IAuthService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private AuthCredentialRepo authCredentialRepo;

    @Autowired
    private SessionRepo sessionRepo;

    @Override
    public SignupResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) throws UserNotSignedUpException, BadCredentialsException {
        return null;
    }

    private String getToken() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 15) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
}
