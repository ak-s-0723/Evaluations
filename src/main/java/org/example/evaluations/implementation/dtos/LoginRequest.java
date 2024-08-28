package org.example.evaluations.implementation.dtos;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
