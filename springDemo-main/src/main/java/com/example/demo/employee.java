package com.example.demo;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "employee")
@Entity
@Getter
@Setter
class Employee {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;

    @Basic@Column(name="name")
    private String name;

    @Basic@Column(name="age")
    private Integer age;

    @Basic@Column(name="active")
    private Boolean active;

    @Basic@Column(name="password")
    private String password;
}

'request':{
    "queryParameters":[
        {
        "name": "Department A",
        "description": "This is department A"
        }
        {
        "id": 1,
        "name": "Department A",
        "description": "This is department A"
        }
        {
        "name": "John Doe",
        "email": "johndoe@example.com",
        "departmentId": 1
        }
        {
        "id": 1,
        "name": "John Doe",
        "email": "johndoe@example.com",
        "departmentId": 1
        }
        {
        "id": 1,
        "name": "John Doe",
        "email": "johndoe@example.com",
        "departmentId": 2
        }
        [
        {
        "id": 1,
        "name": "John Doe",
        "email": "johndoe@example.com",
        "departmentId": 2
        },
        {
        "id": 2,
        "name": "Jane Doe",
        "email": "janedoe@example.com",
        "departmentId": 2
        }
        [
        {
        "id": 1,
        "name": "John Doe",
        "email": "johndoe@example.com",
        "departmentId": 2
        },
        {
        "id": 2,
        "name": "Jane Doe",
        "email": "janedoe@example.com",
        "departmentId": 2
        }
        [
        {
        "id": 1,
        "name": "John Doe",
        "email": "johndoe@example.com",
        "departmentId": 2
        },
        {
        "id": 2,
        "name": "Jane Doe",
        "email": "janedoe@example.com",
        "departmentId": 2
        }
        [
        {
        "id": 1,
        "name": "John Doe",
        "email": "johndoe@example.com",
        "departmentId": 2
        },
        {
        "id": 2,
        "name": "Jane Doe",
        "email": "janedoe@example.com",
        "departmentId": 2
        }
        ]
            ]
        }