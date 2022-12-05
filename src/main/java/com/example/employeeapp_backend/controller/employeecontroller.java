package com.example.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeecontroller {
    @PostMapping("/")
    public String homepage()
    {
        return "Welcome Home page";
    }
    @PostMapping("/add")
    public String add()
    {
        return "Welcome Employee add page";
    }
    @PostMapping("/search")
    public String search()
    {
        return "Search employee";
    }
    @PostMapping("/edit")
    public String edit()
    {
        return "Edit  employee";
    }
    @PostMapping("/delete")
    public String delete()
    {
        return "Delete  employee";
    }
    @PostMapping("/view")
    public String view()
    {
        return "View all  employee";
    }

}
