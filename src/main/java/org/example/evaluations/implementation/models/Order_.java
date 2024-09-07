package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity(name="orders_")
public class Order_ extends BaseModel_ {
    @ManyToOne
    private Customer_ customer;

    @OneToMany(mappedBy = "order")
    private List<ItemDetail_> items;

    private Double totalCost;

    @OneToMany(mappedBy = "order")
    private List<OrderStateTimeMapping_> orderTimeline;
}
