package org.example.evaluations.implementation.services;

import org.example.evaluations.implementation.dtos.SortParam_;
import org.example.evaluations.implementation.dtos.SortType_;
import org.example.evaluations.implementation.models.Employee_;
import org.example.evaluations.implementation.repos.EmployeeRepository_;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeFinderService_ {

    @Autowired
    private EmployeeRepository_ employeeRepository;

    public Page<Employee_> findEmployees(String department, Integer pageNumber, Integer pageSize, List<SortParam_> sortParams) {
        Sort sort = null;
        if(!sortParams.isEmpty()) {
            if(sortParams.get(0).getSortType().equals(SortType_.ASC))
                sort = Sort.by(sortParams.get(0).getParamName());
            else
                sort = Sort.by(sortParams.get(0).getParamName()).descending();

            for(int i = 1; i< sortParams.size(); i++) {
                if(sortParams.get(i).getSortType().equals(SortType_.ASC))
                    sort.and(Sort.by(sortParams.get(i).getParamName()));
                else
                    sort.and(Sort.by(sortParams.get(i).getParamName()).descending());
            }
        }

        return employeeRepository.findEmployeeByDepartment(department, PageRequest.of(pageNumber,pageSize,sort));
    }
}
