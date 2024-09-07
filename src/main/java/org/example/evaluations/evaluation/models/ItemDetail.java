package org.example.evaluations.evaluation.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemDetail extends BaseModel {
    private Item item;

    private Long quantity;

    private Order order;
}
