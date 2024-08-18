package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService {

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Override
    public List<Product> getProducts(String categoryName) {
        //Add your implementation here.
       return null;
    }
}
