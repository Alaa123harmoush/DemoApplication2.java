package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "employee")

@CrossOrigin(origins = "*")

public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/getAllUsers", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeEmployeeDTO> getAllUsers() {
        return employeeService.getAll();
    }

    @GetMapping(value = "/getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<EmployeeDTO> findById(@PathVariable Map<String, String> pathMap) {
        int id = Integer.valueOf(pathMap.get("id"));
        return employeeService.findById(id);
    }

    @PostMapping(value = "/addNewUser", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, Object> addNewEmployee(@RequestBody EmployeeDTO employeeDto) {
        employeeService.newEmployee(employeeDto);
        HashMap<String, Object> map = new HashMap<>();
        map.put("Success", true);
        map.put("message", "User created successfully");
        return map;
    }

    @PutMapping(value = "/updateUser", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void updateEmployee(EmployeeDTO employeeDto) {

    }

    @DeleteMapping(value = "/deleteEmployee/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteUser(int id) {
        employeeService.deleteEmployee(id);
    }
}

