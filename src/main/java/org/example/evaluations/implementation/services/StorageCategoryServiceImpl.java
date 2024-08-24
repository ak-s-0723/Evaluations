package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.models.Category_;
import org.example.evaluations.implementation.repos.CategoryRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StorageCategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category_ addCategory(@NotNull Category_ category) {
        Optional<Category_> categoryOptional = categoryRepository.findCategoryById(category.getId());
        if(categoryOptional.isPresent()) {
            return categoryOptional.get();
        }

        return categoryRepository.save(category);
    }

    public List<Category_> getAllPremiumCategories() {
        return categoryRepository.findCategoryByIsPremiumTrue();
    }

    public List<Category_> getCategoriesBetweenIds(Long categoryId1, Long categoryId2) {
        return categoryRepository.findCategoryByIdBetween(categoryId1,categoryId2);
    }


    public List<Category_> getCategoriesWithMatchingName(String categoryName) {
        return categoryRepository.findCategoryByName(categoryName);
    }
}
