package com.cydeo.repository;

import com.cydeo.entity.Course;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course,Long> {


    //Find all courses by category
    List<Course> findByCategory(String category);

    //Find all courses by category and order the entities by name
    List<Course> findByCategoryOrderByName(String category);

    //Checks if a course with the supplied name exists. Return true if exists, false otherwise
    Boolean existsByName(String name);

    //Returns the count of courses for the given category
    Integer countByCategory(String category);

    //Finds all the courses that start with the given course name string
    List<Course> findByNameStartsWith(String pattern);

    //Find all courses by category and returns a stream
    Stream<Course> streamAllByCategory(String category);












}
