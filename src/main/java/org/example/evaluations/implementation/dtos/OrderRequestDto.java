package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;
import org.example.evaluations.implementation.models.OrderStatus;

import java.util.Date;

@Setter
@Getter
public class OrderRequestDto {
    private Long customerId;
    private Double totalAmount;
}
