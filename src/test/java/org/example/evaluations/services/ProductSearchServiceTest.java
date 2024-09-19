package org.example.evaluations.services;

import org.example.evaluations.evaluation.repos.ProductRepository;
import org.example.evaluations.evaluation.services.ProductSearchService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProductSearchServiceTest {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductSearchService productSearchService;

}
