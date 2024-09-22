package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.ProductRequestDto_;
import org.example.evaluations.implementation.models.Product_;
import org.example.evaluations.implementation.services.ProductService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/product_")
public class ProductController_ {

    @Autowired
    private ProductService_ productService;

    @PostMapping
    public Product_ addProduct(@RequestBody ProductRequestDto_ productRequestDto) {
        Product_ product = getProduct(productRequestDto);
        return productService.addProduct(product);
    }


    @GetMapping
    public Set<Product_> getPopularProducts() {
        return productService.getPopularProducts();
    }

    private Product_ getProduct(ProductRequestDto_ productDto) {
        Product_ product = new Product_();
        product.setTitle(productDto.getTitle());
        product.setPrice(productDto.getPrice());
        product.setImageUrl(productDto.getImageUrl());
        product.setDescription(productDto.getDescription());
        product.setCategory(productDto.getCategory());
        return product;
    }

}
