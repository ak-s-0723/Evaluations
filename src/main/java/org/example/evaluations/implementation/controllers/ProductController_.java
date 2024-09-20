package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.dtos.ProductQueryDto_;
import org.example.evaluations.implementation.models.Product_;
import org.example.evaluations.implementation.services.ProductSearchService_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.*;


@RestController
public class ProductController_ {

    @Autowired
    private ProductSearchService_ productSearchService;

    @GetMapping("/products_/{actualWeight}/{weightLimit}")
    public Slice<Product_> findProductsWhichCanBeTakenInHandBaggageBecauseOfWeightLimit(@RequestParam Integer pageNumber, @RequestParam Integer pageSize, @PathVariable("actualWeight") Double actualWeight, @PathVariable("weightLimit") Double weightLimit) {
        return productSearchService.findProductsWhichCanBeTakenInHandBaggageBecauseOfWeightLimit(weightLimit,actualWeight,pageNumber,pageSize);
    }


    @GetMapping("/products_/category/{category}")
    public Slice<Product_> findProductsBelongingToCategoryDisplayedByAge(@RequestParam Integer pageNumber, @RequestParam Integer pageSize, @PathVariable String category) {
        return productSearchService.findProductsBelongingToCategoryShownByAge(category,pageNumber,pageSize);
    }

    @PostMapping("/products_/search")
    public Page<Product_> findProductsBySearchQuerySortedByUserProvidedCriteria(@RequestBody ProductQueryDto_ productQueryDto) {
        return productSearchService.findProductsBySearchQuerySortedByUserProvidedCriteria(productQueryDto.getQuery(), productQueryDto.getPageNumber(), productQueryDto.getPageSize(), productQueryDto.getSortParamName(), productQueryDto.getSortType());
    }
}
