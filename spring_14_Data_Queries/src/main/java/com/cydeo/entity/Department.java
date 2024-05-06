package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "departments")
@Data
@NoArgsConstructor
public class Department { // we dont extend from BaseEntity class because department id is department

    @Id
    private String department;
    private String division;

}
