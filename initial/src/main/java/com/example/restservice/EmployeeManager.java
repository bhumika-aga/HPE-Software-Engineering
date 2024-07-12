package com.example.restservice;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeManager {
    private static Employees list = new Employees();

    static {
        list.getEmployeeList().add(new Employee("1", "John", "Doe", "john.doe@example.com", "Software Developer"));
        list.getEmployeeList().add(new Employee("2", "Jane", "Doe", "jane.doe@example.com", "Project Manager"));
        list.getEmployeeList()
                .add(new Employee("3", "Josh", "Doe", "josh.doe@example.com", "Senior Software Engineer"));
    }

    public Employees getAllEmployees() {
        return list;
    }

    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}