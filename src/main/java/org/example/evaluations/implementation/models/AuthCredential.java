package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name="AuthCredentials_")
@Data
public class AuthCredential {
    @Id
    private String email;

    private String password;
}
