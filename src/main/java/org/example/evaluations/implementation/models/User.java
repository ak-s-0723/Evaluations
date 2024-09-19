package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name="user__")
public class User {

    @Id
    private Long id;

    private String emailId;

    private String name;

    private String phoneNumber;

    private String address;

    private Sex_ sex;

    private Integer age;
}
