package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Address_ {
    @Id
    private Long id;
    private Long number;
    private String street;
    private String city;
    private String landmark;
    private String state;
    private String pincode;

    @ManyToMany(mappedBy = "addresses")
    private List<Person_> persons;
}
