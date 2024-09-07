package org.example.evaluations.evaluation.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Inventory extends BaseModel {
    private Item item;

    private Double count;

    private Double orderingCost;

    private Double stockOutCost;
}
