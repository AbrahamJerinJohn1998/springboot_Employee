package com.example.employeeapp_backend.controller.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue

    private int id;
    private int code;
    private String name;
    private String designation;
    private int salary;
    private String phoneNo;
    private String email;
    private String cname;
    private int yearOfExpereince;

    public Employee() {
    }

    public Employee(int id, int code, String name, String designation, int salary, String phoneNo, String email, String cname, int yearOfExpereince) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.phoneNo = phoneNo;
        this.email = email;
        this.cname = cname;
        this.yearOfExpereince = yearOfExpereince;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getYearOfExpereince() {
        return yearOfExpereince;
    }

    public void setYearOfExpereince(int yearOfExpereince) {
        this.yearOfExpereince = yearOfExpereince;
    }
}