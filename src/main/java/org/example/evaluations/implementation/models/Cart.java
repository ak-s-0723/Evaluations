package org.example.evaluations.implementation.models;

import lombok.Data;
import org.example.evaluations.implementation.dtos.FakeStoreProduct;

import java.util.*;

@Data
public class Cart {
    private Long id;
    private Long userId;
    private Date date;
    private Map<Long,Double> products= new HashMap<>();
}
