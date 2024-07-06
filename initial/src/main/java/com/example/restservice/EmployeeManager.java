package main.java.com.example.restservice;

import java.util.List;

public class EmployeeManager {
    public static void main(String[] args) {
        Employees employees = new Employees();

        List<Employee> allEmployees = employees.getEmployeeList();
        for (Employee employee : allEmployees) {
            System.out.println(employee.getFirst_name() + " " + employee.getLast_name());
        }
    }
}