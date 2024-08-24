package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.models.Category_;
import org.example.evaluations.implementation.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriesController {

    @Autowired
    private ICategoryService categoryService;

    @PostMapping
    Category_ addCategory(@RequestBody Category_ category) {
      return categoryService.addCategory(category);
    }

    @GetMapping("/premium")
    List<Category_> getAllPremiumCategories() {
       return categoryService.getAllPremiumCategories();
    }

    @GetMapping("/{categoryId1}/{categoryId2}")
    List<Category_> getCategoriesBetweenIds(@PathVariable Long categoryId1, @PathVariable Long categoryId2) {
        return categoryService.getCategoriesBetweenIds(categoryId1,categoryId2);
    }

    @GetMapping("/{categoryName}")
    List<Category_> getCategoriesWithMatchingName(@PathVariable String categoryName) {
         return categoryService.getCategoriesWithMatchingName(categoryName);
    }
}
