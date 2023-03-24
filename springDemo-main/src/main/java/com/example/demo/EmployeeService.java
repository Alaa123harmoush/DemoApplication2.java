package com.example.demo;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDTO> getAll();
    List<EmployeeDTO> findById(int id);

    void newEmployee(EmployeeDTO employeeDto);
    void updateEmployee(EmployeeDTO employeeDto);
    void deleteEmployee(int id);
//    UserDTO getById(Integer id);
}
