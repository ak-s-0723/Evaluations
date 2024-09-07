package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Address_ extends BaseModel_ {
    private String number;
    private String street;
    private String city;
    private String pincode;
    private String landmark;
    private String state;
    private Boolean isDefault;

    @ManyToMany(mappedBy = "addresses")
    private List<Customer_> customers;
}
