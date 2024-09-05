package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Category_;
import org.example.evaluations.implementation.models.Image_;
import org.example.evaluations.implementation.models.Product_;
import org.example.evaluations.implementation.models.SubCategory_;
import org.example.evaluations.implementation.repos.CategoryRepo_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService_ {

    @Autowired
    private CategoryRepo_ categoryRepo;

    public List<String> getNamesOfAllCategoriesAndLinkedProductsAndTheirImages() {
        List<String> namesOfAllEntities = new ArrayList<>();

        List<Category_> categories = categoryRepo.findAll();
        for(Category_ category : categories) {
            namesOfAllEntities.add(category.getTitle());
            for(Product_ product : category.getProductList()) {
                namesOfAllEntities.add(product.getName());
                for(Image_ image : product.getImages()) {
                     namesOfAllEntities.add(image.getDescriptiveName());
                }
            }
        }

        return namesOfAllEntities;
    }

    public List<String> getNamesOfAllCategoriesAndTheirSubCategories() {
        List<String> namesOfAllEntities = new ArrayList<>();

        List<Category_> categories = categoryRepo.findAll();
        for(Category_ category : categories) {
            namesOfAllEntities.add(category.getTitle());
            for(SubCategory_ subCategory : category.getSubCategories()) {
                namesOfAllEntities.add(subCategory.getName());
            }
        }

        return namesOfAllEntities;
    }
}
