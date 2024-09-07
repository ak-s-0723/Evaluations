package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Setter
@Getter
public class OrderStateTimeMapping_ extends BaseModel_ {

    private OrderState_ orderState = OrderState_.CONFIRMED;

    private Date date = new Date();

    @ManyToOne
    private Order_ order;
}
