package org.example.evaluations.evaluation.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Item extends BaseModel {
    private String title;
    private String description;
    private String imageUrl;
    private Double price;
    private Boolean isPremium;
    private Inventory inventory;
}
