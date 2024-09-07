package org.example.evaluations.implementation.dtos;

import lombok.Data;

import java.util.Map;

@Data
public class CreateOrderRequestDto_ {
    private Map<Long,Long> itemQuantityMap;
    private Long customerId;
}
