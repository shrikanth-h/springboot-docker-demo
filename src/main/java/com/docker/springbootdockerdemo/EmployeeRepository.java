package com.docker.springbootdockerdemo;

import com.docker.springbootdockerdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    public Employee findByEmail(String email);
    public Employee findByFirstName(String firstName);



}
