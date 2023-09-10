package com.Student_Affairs.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name",nullable = false)
    private String firstName;
    @Column(name = "last_name",nullable = false)
    private String lastName;
    @Column(name = "gpa",nullable = false)
    private double gpa;

    @Column(name = "department",nullable = false)
    private String department;

    @Column(name = "status",nullable = false)
    private boolean status;


    /*public boolean getStatus()
    {
        return status;
    }*/




}
