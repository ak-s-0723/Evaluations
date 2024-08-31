package org.example.evaluations.evaluation.models;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Guest {
    @Id
    private String email;

    private String name;
}
