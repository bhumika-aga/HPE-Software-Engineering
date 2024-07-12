package com.example.restservice;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class EmployeeController {

    @Autowired
    private static EmployeeManager employees;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employees.getAllEmployees().getEmployeeList();
    }

    @PostMapping("/employees")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee) {
        Integer employeeId = employees.getAllEmployees().getEmployeeList().size() + 1;

        employee.setEmployee_id(employeeId.toString());

        employees.addEmployee(employee);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(employee.getEmployee_id()).toUri();

        return ResponseEntity.created(location).build();
    }
}