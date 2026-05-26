package com.cicd.pipeline.controller;

import com.cicd.pipeline.entity.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    List<Employee> employees = new ArrayList<>();

    @GetMapping
    public List<Employee> employees() {
        return employees;
    }

    @PostMapping
    public String addEmployee(@RequestBody Employee employee) {
        employees.add(employee);
        return "Employee added";
    }

    @GetMapping("/health")
    public String health() {
        return "Application running";
    }
}
