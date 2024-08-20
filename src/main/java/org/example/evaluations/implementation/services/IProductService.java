package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.AmazonProduct;

import java.util.List;

public interface IProductService {
    List<AmazonProduct> getProductByName(String name);
    List<AmazonProduct> getProductByCategoryId(String categoryId);
}
