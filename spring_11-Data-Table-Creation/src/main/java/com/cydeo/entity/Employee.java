package com.cydeo.entity;

import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity // it means make table from this class name
public class Employee { // this is  gonna be column name.

    @jakarta.persistence.Id
    private int id;
    private String name ;





}
