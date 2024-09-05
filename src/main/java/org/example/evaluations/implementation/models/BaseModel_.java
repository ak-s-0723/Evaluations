package org.example.evaluations.implementation.models;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseModel_ {
    @Id
    private Long id;

    private State_ state;
}
