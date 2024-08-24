package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Category_;

import java.util.List;

public interface ICategoryService {
    Category_ addCategory(Category_ category);

    List<Category_> getAllPremiumCategories();

    List<Category_> getCategoriesBetweenIds(Long categoryId1, Long categoryId2);

    List<Category_> getCategoriesWithMatchingName(String categoryName);
}
