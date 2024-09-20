package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Product_;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository_ extends JpaRepository<Product_,Long> {

    Slice<Product_> findProductByWeightLessThanEqual(Double weight, Pageable pageable);

    Slice<Product_> findProductByCategory(String category, Pageable pageable);

    Page<Product_> findProductByName(String name, Pageable pageable);
}
