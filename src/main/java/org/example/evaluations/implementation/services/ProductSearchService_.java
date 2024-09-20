package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.dtos.SortType_;
import org.example.evaluations.implementation.models.Product_;
import org.example.evaluations.implementation.repos.ProductRepository_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ProductSearchService_ {

    @Autowired
    private ProductRepository_ productRepository;

    public Slice<Product_> findProductsWhichCanBeTakenInHandBaggageBecauseOfWeightLimit(Double allowedLimit, Double actualWeight, Integer pageNumber, Integer pageSize) {
        Double difference = actualWeight - allowedLimit;
        Sort sort = Sort.by("amount").descending().and(Sort.by("weight"));
        return productRepository.findProductByWeightLessThanEqual(Math.abs(difference), PageRequest.of(pageNumber,pageSize,sort));
    }


    public Slice<Product_> findProductsBelongingToCategoryShownByAge(String category, Integer pageNumber, Integer pageSize) {
        Sort sort = Sort.by("age");
        return productRepository.findProductByCategory(category,PageRequest.of(pageNumber,pageSize,sort));
    }

    public Page<Product_> findProductsBySearchQuerySortedByUserProvidedCriteria(String query, Integer pageNumber, Integer pageSize, String sortParamName, SortType_ sortType) {
        Sort sort = null;
        if(sortType.equals(SortType_.ASC))
            sort = Sort.by(sortParamName);
        else
            sort = Sort.by(sortParamName).descending();

        return  productRepository.findProductByName(query,PageRequest.of(pageNumber,pageSize,sort));
    }
}
