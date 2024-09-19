package org.example.evaluations.services;

import org.example.evaluations.evaluation.dtos.SortParam;
import org.example.evaluations.evaluation.dtos.SortType;
import org.example.evaluations.evaluation.models.Employee;
import org.example.evaluations.evaluation.repos.EmployeeRepository;
import org.example.evaluations.evaluation.services.EmployeeFinderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class EmployeeFinderServiceTest {

    @MockBean
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeFinderService employeeFinderService;

    @Test
    public void testFindEmployeesWithAscendingSort() {
        // Arrange
        String department = "Engineering";
        Integer pageNumber = 0;
        Integer pageSize = 5;

        SortParam sortParam = new SortParam();
        sortParam.setParamName("fullName");
        sortParam.setSortType(SortType.ASC);

        List<SortParam> sortParams = Arrays.asList(sortParam);

        Employee employee2 = createEmployee("John Doe");
        Employee employee1 = createEmployee("Alice Smith");
        List<Employee> employees = Arrays.asList(employee1, employee2);
        Page<Employee> employeePage = new PageImpl<>(employees, PageRequest.of(pageNumber, pageSize), employees.size());

        when(employeeRepository.findEmployeeByDepartment(department, PageRequest.of(pageNumber, pageSize, Sort.by("fullName")))).thenReturn(employeePage);

        // Act
        Page<Employee> result = employeeFinderService.findEmployees(department, pageNumber, pageSize, sortParams);

        // Assert
        assertEquals(2, result.getContent().size());
        assertEquals("Alice Smith", result.getContent().get(0).getFullName());
    }

    @Test
    public void testFindEmployeesWithDescendingSort() {
        // Arrange
        String department = "Engineering";
        Integer pageNumber = 0;
        Integer pageSize = 5;

        SortParam sortParam = new SortParam();
        sortParam.setParamName("fullName");
        sortParam.setSortType(SortType.DESC);

        List<SortParam> sortParams = Arrays.asList(sortParam);

        Employee employee1 = createEmployee("John Doe");
        Employee employee2 = createEmployee("Alice Smith");
        List<Employee> employees = Arrays.asList(employee1, employee2);
        Page<Employee> employeePage = new PageImpl<>(employees, PageRequest.of(pageNumber, pageSize), employees.size());

        when(employeeRepository.findEmployeeByDepartment(department, PageRequest.of(pageNumber, pageSize, Sort.by("fullName").descending()))).thenReturn(employeePage);

        // Act
        Page<Employee> result = employeeFinderService.findEmployees(department, pageNumber, pageSize, sortParams);

        // Assert
        assertEquals(2, result.getContent().size());
        assertEquals("John Doe", result.getContent().get(0).getFullName());
    }

    private Employee createEmployee(String fullName) {
        Employee employee = new Employee();
        employee.setId(UUID.randomUUID());
        employee.setFullName(fullName);
        employee.setDepartment("Engineering");
        return employee;
    }
}
