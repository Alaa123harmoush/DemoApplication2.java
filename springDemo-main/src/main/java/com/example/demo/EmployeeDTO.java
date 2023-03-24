package com.example.demo;

import lombok.Data;

@Data
public class EmployeeDTO {

    private Integer id;

    private String name;

    private Integer age;

    private Boolean active;

    private String activeDesc;
}
