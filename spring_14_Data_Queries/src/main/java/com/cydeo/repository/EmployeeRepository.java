package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    //Display all employees with email adress ""
    List<Employee> findByEmail(String email);

    //Display all employees with firstname "" and last name "",
    //also show all employees with an email address ""
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstname,String lastname,String email);

    //Display all employees that first name is not ""
    List<Employee> findByFirstNameIsNot(String firstName);

    //Display all employees where last name starts with ""
    List<Employee> findByLastNameStartingWith(String pattern);

    //Display all employees with salaries higher than ""
    List<Employee> findBySalaryGreaterThan(Integer salary);

    //Display all employees with salaries less than ""
    List<Employee> findBySalaryLessThan(Integer salary);

    //Display all employees that has been hired between "" and ""
    List<Employee> findByHireDateBetween(LocalDate startDate,LocalDate endDate);

    //Display all employees where salaries greater and equal to "" in order-salary
    List<Employee> findBySalaryGreaterThanEqualOrderBySalary(Integer salary);

    //Display top unique 3 employees that is making less than ""
    List<Employee> findDistinctTopBySalaryLessThan(Integer salary);

    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();





                                         //       JPQL QUERIES

    @Query("SELECT employee from Employee employee where employee.email='amcnee1@google.es'" )
    Employee retrieveEmployeeDetail(); // Employee is what we gonna return


    @Query("select e.salary from Employee  e where e.email='amcnee1@google.es'")
    Integer retrieveEmployeeSalary(); // Integer is what we gonna return.

    //Not Equal
    @Query("select e from Employee e where e.salary !=")
    List<Employee> etrieveEmployeeSalaryNotEqual(Integer salary);











}
