package org.example.evaluations.evaluation.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Address extends BaseModel {
    private String number;
    private String street;
    private String city;
    private String pincode;
    private String landmark;
    private String state;
    private Boolean isDefault;
    private List<Customer> customers;
}
