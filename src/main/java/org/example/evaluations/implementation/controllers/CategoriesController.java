package org.example.evaluations.implementation.controllers;

import org.example.evaluations.implementation.models.Category;
import org.example.evaluations.implementation.services.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products/categories_")
public class CategoriesController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public List<Category> getCategories() {
       return categoryService.getCategories();
    }
}
