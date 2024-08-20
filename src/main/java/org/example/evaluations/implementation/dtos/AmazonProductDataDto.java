package org.example.evaluations.implementation.dtos;

import lombok.Data;
import org.example.evaluations.implementation.models.AmazonProduct;

import java.util.List;

@Data
public class AmazonProductDataDto {
    private List<AmazonProduct> products;
}
