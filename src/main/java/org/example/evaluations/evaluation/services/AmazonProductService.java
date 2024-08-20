package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.models.AmazonProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmazonProductService implements IProductService {

    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    public List<AmazonProduct> getProductByName(String name) {
        //Add your implementation here.
        return null;
    }

    public List<AmazonProduct> getProductByCategoryId(String categoryId) {
        //Add your implementation here.
        return null;
    }
}