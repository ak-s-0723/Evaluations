package org.example.evaluations.implementation.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Data
public class Category_ extends BaseModel_ {

    private String title;

    @OneToMany(mappedBy = "category")
    @Fetch(FetchMode.SUBSELECT)
    private List<Product_> productList;

    @OneToMany(mappedBy = "category")
    @Fetch(FetchMode.SELECT)
    @BatchSize(size=3)
    private List<SubCategory_> subCategories;
}
