package com.docker.springbootdockerdemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {


    @Column(name="firstname")
    private String firstName;
    @Column(name="lastName")
    private String lastName;

    @Id
    @Column(name="email")
    private String email;


}
