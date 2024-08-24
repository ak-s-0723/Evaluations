package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Category_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category_,Long> {
    Category_ save(Category_ category);

    Optional<Category_> findCategoryById(Long id);

    List<Category_> findCategoryByName(String name);

    List<Category_> findCategoryByIdBetween(Long id1, Long id2);

    List<Category_> findCategoryByIsPremiumTrue();
}
