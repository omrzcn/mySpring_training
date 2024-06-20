package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // there is no view anymore
@RequestMapping("/courses/api/v1")
public class CourseController {

private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseDTO> getAllCourses(){

        return courseService.getCourses();
    }


    @GetMapping("{id}")
    public CourseDTO getCourseById(@PathVariable("id") long courseId){

        return courseService.getCourseById(courseId);
    }


    @GetMapping("/category/{name}")
    public List<CourseDTO> getCoursesByCategory(@PathVariable("name") String category){

        return courseService.getCoursesByCategory(category);
    }



    @PostMapping()
    public CourseDTO createCourse(@RequestBody CourseDTO courseDTO){
        return courseService.createCourse(courseDTO);
    }


    @PutMapping("{id}")
    public void updateUser(@PathVariable("id") Long courseId, @RequestBody CourseDTO courseDTO){

         courseService.updateCourse(courseId,courseDTO);
    }

    @DeleteMapping("{id}")
    public void deleteCourseById(@PathVariable("id") Long courseId){
        courseService.deleteCourseById(courseId);
    }



}
