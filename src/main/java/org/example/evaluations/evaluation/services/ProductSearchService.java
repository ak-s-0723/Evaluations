package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.dtos.SortType;
import org.example.evaluations.evaluation.models.Product;
import org.example.evaluations.evaluation.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

@Service
public class ProductSearchService {

    @Autowired
    private ProductRepository productRepository;

    public Slice<Product> findProductsWhichCanBeTakenInHandBaggageBecauseOfWeightLimit(Double allowedLimit, Double actualWeight,Integer pageNumber,Integer pageSize) {
        return null;
    }


    public Slice<Product> findProductsBelongingToCategoryShownByAge(String category,Integer pageNumber,Integer pageSize) {
       return null;
    }

    public Page<Product> findProductsBySearchQuerySortedByUserProvidedCriteria(String query, Integer pageNumber, Integer pageSize, String sortParamName, SortType sortType) {
       return null;
    }
}
