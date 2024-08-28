package org.example.evaluations.evaluation.models;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class AuthCredential {
    @Id
    private String email;

    private String password;
}
