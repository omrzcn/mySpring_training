package com.cydeo.bootstrap;

import com.cydeo.model.Student;
import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    public static List<Student> createStudent(){

        Faker faker = new Faker();
        List<Student> students = Arrays.asList(
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,50),faker.address().state()),
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,50),faker.address().state()),
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,50),faker.address().state()),
                new Student(faker.name().firstName(),faker.name().lastName(),faker.number().numberBetween(20,50),faker.address().state()));

        return students;

    }

}
