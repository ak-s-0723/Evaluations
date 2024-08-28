package org.example.evaluations.implementation.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name="Users_")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    @OneToOne
    private AuthCredential authCredential;
}
