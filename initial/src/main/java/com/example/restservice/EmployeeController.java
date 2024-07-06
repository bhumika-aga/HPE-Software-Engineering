package com.example.restservice;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private final Employees employees;

    public EmployeeController() {
        employees = new Employees();
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employees.getEmployeeList();
    }
}