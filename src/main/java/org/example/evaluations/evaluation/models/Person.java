package org.example.evaluations.evaluation.models;

import lombok.Data;

import java.util.List;

@Data
public class Person {
    private Long id;
    private String name;
    private String phoneNumber;
    private List<Address> addresses;
}
