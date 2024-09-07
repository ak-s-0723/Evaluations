package org.example.evaluations.evaluation.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Customer {
    private Long id;

    private String name;

    private List<Address> addresses;

    private String email;

    private String password;

    private List<Order> orders;
}
