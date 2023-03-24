package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    @Override
    public List<EmployeeDTO> getAll() {
        List<EmployeeDTO> employees = employeeRepository.findAll().stream().map( employee -> {
            EmployeeDTO employeeDto = employeeMapper.EmployeeToEmployeeDTO(employee);
            String activeDesc = employeeDto.getActive() ? "Yes" : "No";
            employeeDto.setActiveDesc(activeDesc);

            return employeeDto;
        }).collect(Collectors.toList());

        return employees;
    }

    @Override
    public List<EmployeeDTO> findById(int id) {
        return null;
    }

    @Override
    public void newUser(EmployeeDTO employee) {
        Employee employeeToAdd = employeeMapper.EmployeeDTOToEmployee(employee);
        employeeRepository.saveAndFlush(employeeToAdd);
    }

    @Override
    public void updateEmployee(EmployeeDTO employeeDto) {
        employeeRepository.saveAndFlush(employeeMapper.EmployeeDTOToEmployee(employeeDto));
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}
