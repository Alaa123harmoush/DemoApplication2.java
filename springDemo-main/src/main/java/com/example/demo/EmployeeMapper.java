package com.example.demo;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {
    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
    EmployeeDTO EmployeeToUserDTO(Employee employee);
    Employee EmployeeDTOToEmployee(Employee employeeDto);
}
