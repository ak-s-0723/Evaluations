package org.example.evaluations.evaluation.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class OrderStateTimeMapping extends BaseModel {

    private OrderState orderState = OrderState.CONFIRMED;

    private Date date = new Date();

    private Order order;
}
