package com.docker.springbootdockerdemo.service.impl;

import com.docker.springbootdockerdemo.EmployeeRepository;
import com.docker.springbootdockerdemo.entity.Employee;
import com.docker.springbootdockerdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    public EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployee(String email){

        Employee employee = employeeRepository.findByEmail(email);

        return employee;
    }

}
