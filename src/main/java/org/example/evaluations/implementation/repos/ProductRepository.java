package org.example.evaluations.implementation.repos;

import org.example.evaluations.implementation.models.Product_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product_,Long> {
    List<Product_> findByName(String name);

    void deleteById(Long id);

    void deleteAll();

    Long deleteByName(String name);

    void deleteByCategoryName(String categoryName);

    @Modifying
    @Query("delete from Product_ p where p.id in (select c.id from Category_ c where c.id=?1)")
    void deleteProductWhereIdMatchesCategoryId(Long categoryId);

    @Modifying
    @Query("delete from Product_ p where p.createdAt < ?1")
    int retainProductsAfter(Date retainDate);
}
