package com.cydeo.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@MappedSuperclass
public class Account { // this class is only for inheritance relationship, there will be no column

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String owner;
    private BigDecimal balance;
    private BigDecimal interestRate;



}
