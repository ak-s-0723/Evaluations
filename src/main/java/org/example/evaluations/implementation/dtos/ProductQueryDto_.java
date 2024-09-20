package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductQueryDto_ {
    private Integer pageSize;
    private Integer pageNumber;
    private String query;
    private String sortParamName;
    private SortType_ sortType;
}
