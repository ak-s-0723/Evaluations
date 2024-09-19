package org.example.evaluations.implementation.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class EmployeeFinderRequestDto_ {
    private String department;
    private Integer pageNumber;
    private Integer pageSize;
    List<SortParam_> sortParamList = new ArrayList<>();
}
