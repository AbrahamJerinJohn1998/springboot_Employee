package com.example.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeecontroller {
    @GetMapping("/")
    public String homepage()
    {
        return "Welcome Home page";
    }
    @GetMapping("/add")
    public String add()
    {
        return "Welcome Employee add page";
    }
    @GetMapping("/search")
    public String search()
    {
        return "Search employee";
    }
    @GetMapping("/edit")
    public String edit()
    {
        return "Edit  employee";
    }
    @GetMapping("/delete")
    public String delete()
    {
        return "Delete  employee";
    }

}
