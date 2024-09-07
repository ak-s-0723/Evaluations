package org.example.evaluations.evaluation.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Order extends BaseModel {

    private Customer customer;

    private List<ItemDetail> items;

    private Double totalCost;

    private List<OrderStateTimeMapping> orderTimeline;
}
