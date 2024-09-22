package org.example.evaluations.evaluation.services;

import org.example.evaluations.evaluation.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ProductService {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    private String PRODUCT_IN_DEMAND = "iphone";
    private final String REDIS_KEY_POPULAR_PRODUCT = "iphone_related";
    private final String REDIS_KEY_NORMAL_PRODUCT = "products";

    public Set<Product> getPopularProducts() {
        return null;
    }

    public Product addProduct(Product product) {
        return null;
    }
}
