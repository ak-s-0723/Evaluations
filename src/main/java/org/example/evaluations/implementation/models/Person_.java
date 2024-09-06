package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Data
@Entity
public class Person_ {
    @Id
    private Long id;
    private String name;
    private String phoneNumber;

    @ManyToMany
    @Fetch(FetchMode.SUBSELECT)
    private List<Address_> addresses;
}
