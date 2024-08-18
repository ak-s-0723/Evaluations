package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService {

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Override
    public List<Category> getCategories() {
        //Please add your implementation here
        return null;
    }
}
