package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Product;

import java.util.List;

public interface ICategoryService {
    List<Product> getProducts(String categoryName);
}
