package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Data
public class Product_ extends BaseModel_ {

    private String name;

    @ManyToOne
    private Category_ category;

    @OneToMany(mappedBy = "product")
    @Fetch(FetchMode.SUBSELECT)
    private List<Image_> images;
}
