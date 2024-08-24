package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.models.Category;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageCategoryService implements ICategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public Category addCategory(@NotNull Category category) {
        //Add your implementation here.
        return null;
    }

    public List<Category> getAllPremiumCategories() {
        //Add your implementation here.
        return null;
    }

    public List<Category> getCategoriesBetweenIds(Long categoryId1,Long categoryId2) {
        //Add your implementation here.
        return null;
    }


    public List<Category> getCategoriesWithMatchingName(String categoryName) {
        //Add your implementation here.
        return null;
    }
}
