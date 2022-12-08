package com.example.employeeapp_backend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.employeeapp_backend.controller.model.Employee;
import com.example.employeeapp_backend.dao.EmployeeDao;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class employeecontroller {
    @Autowired
    private EmployeeDao dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public Map<String, String> add(@RequestBody Employee e)
    {
        System.out.println(e.getCode());
        System.out.println(e.getName().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getPhoneNo().toString());
        System.out.println(e.getEmail().toString());
        System.out.println(e.getCname().toString());
        System.out.println(e.getYearOfExpereince());
        dao.save(e);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Employee> view()

    {
        return (List<Employee>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
     public List<Employee> searchEmployee(@RequestBody Employee e)
    {
     String code=String.valueOf(e.getCode());
        System.out.println(code);
        return (List<Employee>) dao.SearchEmployee(e.getCode());
    }

}
