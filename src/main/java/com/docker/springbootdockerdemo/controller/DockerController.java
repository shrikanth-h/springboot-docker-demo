package com.docker.springbootdockerdemo.controller;

import com.docker.springbootdockerdemo.entity.Employee;
import com.docker.springbootdockerdemo.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("/docker")
@AllArgsConstructor
public class DockerController {


    public EmployeeService employeeService;

    @GetMapping("/dockertest")
    public String dockerHello(){

        return "Hello Docker from Spring Boot Application";

    }

    @GetMapping("/employee/{email}")
    public Employee getEmployee(@PathVariable(name="email") String  emailId) {

        Employee employee = employeeService.getEmployee(emailId);

        return employee;
    }

}
