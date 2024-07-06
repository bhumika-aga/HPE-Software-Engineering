package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Employees() {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee("1", "John", "Doe", "john.doe@example.com", "Software Engineer"));
        employeeList.add(new Employee("2", "Jane", "Doe", "jane.doe@example.com", "Project Manager"));
    }
}