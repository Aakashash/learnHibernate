package com.example.learnHibernate.hibernate.controller;


import com.example.learnHibernate.hibernate.employee.employee;
import com.example.learnHibernate.hibernate.service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    private employeeService employeeService;
    @GetMapping("/employee/{id}")
    public employee getemployee(@PathVariable int id){

        return employeeService.getemployee(id);
    }
    @GetMapping("/employee/put/{id}")
    public String putemployee(@PathVariable int id){
        employee e = new employee(2,"test","IT");
        employeeService.putemployee(e);
        return  "POtachu";

    }


}
