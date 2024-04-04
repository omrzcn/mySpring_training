package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")

public class StudentController {


   // @RequestMapping(value = "/register", method = RequestMethod.GET) // localhost:8080/student/register
    @GetMapping("/register")  // we are gonna use this anymore. same menaing with above
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent()); //  attributeName="students" is holding the data --> DataGenerator.createStudent();
                                                                                    // we'll manipulate with students name on html page.



        return "student/register";

    }

    @RequestMapping("/welcome")
    public String welcome(){




        return "student/welcome";
    }


}
