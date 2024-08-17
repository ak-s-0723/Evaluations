package org.example.evaluations.implementation.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Permission {
    private Resource resource;
    private Access access;
}
