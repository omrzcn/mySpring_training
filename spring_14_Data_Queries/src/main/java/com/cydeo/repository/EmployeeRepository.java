package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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

   // Not Equal
    @Query("select e from Employee e where e.salary= ?1")
    List<Employee> retrieveEmployeeSalaryNotEqual(Integer salary);


    //Like / Contains / Starts-with / Ends-with
    @Query("select  e from Employee e where e.firstName like ?1")
    List<Employee> retrieveEmployeeFirstNameLike(String pattern);


    //Less Than
    @Query("select e from Employee e where e.salary < ?1")
    List<Employee> retrieveEmployeeSalaryLessThan(Integer salary);

    //Greater Than
    @Query("select e.firstName from Employee e where e.salary > ?1")
    List<String> retrieveElementSalaryGreaterThan(int salary);

    //BETWEEN
    @Query("select e from Employee e where e.salary between ?1 and ?2")
    List<Employee> retrieveEmployeeSalaryBetween(int salary1,int salary2);

    //BEFORE
    @Query("select e from Employee e where e.hireDate < ?1")
    List<Employee> retrieveEmployeeHiredDateBefore(LocalDate hiredDate);

    //NULL
    @Query("select e from Employee e where e.email is null ")
    List<Employee> retrieveEmployeeEmailIsNull();

    //NOT NULL
    @Query("SELECT e FROM Employee e WHERE e.email IS NOT NULL")
    List<Employee> retrieveEmployeeEmailIsNotNull();

    //SORTING in Asc Order
    @Query("select e from Employee e order by e.salary asc ")
    List<Employee> retrieveEmployeeSalaryOrderAsc();

    //SORTING in Desc Order
    @Query("SELECT e FROM Employee e ORDER BY e.salary DESC")
    List<Employee> retrieveEmployeeSalaryOrderDesc();





    //Native Query
    @Query(value = "select * from employees  where  salary = ?1",nativeQuery = true)
    List<Employee> retrieveEmployeeDetailBySalary(int salary);


    //Named Parameter

    @Query("select e from Employee e where e.salary = :salary")
    List<Employee>retrieveEmployeeSalary(@Param("salary") int salary);












}
