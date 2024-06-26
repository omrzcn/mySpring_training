package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import com.cydeo.entity.Department;
import com.cydeo.entity.Employee;
import com.cydeo.enums.Gender;
import com.cydeo.repository.CarRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    private final CarRepository carRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public DataGenerator(CarRepository carRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.carRepository = carRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Car car1 = new Car("BMW","M3");
        Car car2 = new Car("Honda","Civic");
        Car car3 = new Car("Toyota","Corolla");


        // we will save object to database.
        carRepository.save(car1);
        carRepository.save(car2);
        carRepository.save(car3);


        Employee e1 = new Employee("Berrie", "Manueau", "bmanueau0@dion.ne.jp", LocalDate.of(2006,04,20), Gender.FEMALE, 2500);
        Employee e2 = new Employee("Aeriell", "McNee", "amcnee1@google.es", LocalDate.of(2009,01,26),Gender.FEMALE, 2500);
        Employee e3 = new Employee("Sydney", "Symonds", "ssymonds2@hhs.gov", LocalDate.of(2010,05,17), Gender.FEMALE, 2500);
        Employee e4 = new Employee("Avrom", "Rowantree", null, LocalDate.of(2014,03,02), Gender.MALE, 2500);
        Employee e5 = new Employee("Feliks", "Morffew", "fmorffew4@a8.net", LocalDate.of(2003,01,14), Gender.MALE, 2500);

        Department d1 = new Department("Sports", "Outdoors");
        Department d2 = new Department("Tools", "Hardware");
        Department d3 = new Department("Clothing", "Home");
        Department d4 = new Department("Phones & Tablets", "Electronics");
        Department d5 = new Department("Computers", "Electronics");


        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();
        employeeList.addAll(Arrays.asList(e1,e2,e3,e4,e5));
        departmentList.addAll(Arrays.asList(d1,d2,d3,d4,d5));

        employeeRepository.saveAll(employeeList);
        departmentRepository.saveAll(departmentList);







    }
}
