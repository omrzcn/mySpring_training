package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.dto.ResponseWrapper;
import com.cydeo.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses/api/v3")
public class CourseController_ResponseWrapper {

    private final CourseService courseService;

    public CourseController_ResponseWrapper(CourseService courseService) {
        this.courseService = courseService;
    }




    @GetMapping
    public ResponseEntity<ResponseWrapper> getAllCourses(){

        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .header("Version","Cydeo.V3")
                .body(new ResponseWrapper("courses successfully created",courseService.getCourses()));
    }



    @GetMapping("{id}")
    public ResponseEntity<ResponseWrapper> getCourseById(@PathVariable("id") long courseId){

        return ResponseEntity.ok(new ResponseWrapper("course: "+courseId+" retrieved",courseService.getCourseById(courseId)));

    }



    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteCourseById(@PathVariable("id") long courseId){

        courseService.deleteCourseById(courseId);
        return ResponseEntity.noContent().build();

    }


    @PutMapping("{id}")
    public ResponseEntity<Void> updateCourse (@PathVariable("id") long courseId,@RequestBody CourseDTO dto){

       courseService.updateCourse(courseId,dto);
       return ResponseEntity.noContent().build();

    }



}
