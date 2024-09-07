package org.example.evaluations.evaluation.models;

import lombok.Data;

import java.util.List;

@Data
public class Address {
    private Long id;
    private Long number;
    private String street;
    private String city;
    private String landmark;
    private String state;
    private String pincode;
    private List<Person> persons;
}
