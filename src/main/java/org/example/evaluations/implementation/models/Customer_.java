package org.example.evaluations.implementation.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Customer_ {
    @Id
    private Long id;

    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "customers_addresses_",joinColumns = @JoinColumn(name = "customer_id"),inverseJoinColumns = @JoinColumn(name="address_id"))
    private List<Address_> addresses;

    private String email;

    private String password;

    @OneToMany(mappedBy = "customer",fetch = FetchType.EAGER)
    private List<Order_> orders;

    private Long orderCancellationCount;
}
