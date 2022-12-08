package com.example.employeeapp_backend.dao;

import com.example.employeeapp_backend.controller.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {

    @Query(value = "SELECT `id`, `cname`, `code`, `designation`, `email`, `name`, `phone_no`, `salary`, `year_of_expereince` FROM `employees` WHERE `code`=:code",nativeQuery = true)
    List<Employee> SearchEmployee(@Param("code")Integer code);
}

