package org.example.evaluations.implementation.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class ItemDetail_ extends BaseModel_ {

    @OneToOne
    private Item_ item;

    private Long quantity;

    @ManyToOne
    private Order_ order;
}
