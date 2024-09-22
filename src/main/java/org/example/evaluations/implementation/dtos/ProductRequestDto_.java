package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductRequestDto_ {
    private String title;
    private String description;
    private String category;
    private String imageUrl;
    private Double price;
}
