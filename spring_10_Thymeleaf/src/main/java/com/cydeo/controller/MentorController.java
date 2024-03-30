package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    // localhost:8080/mentor/register
    @RequestMapping("/mentor/register") // we dont have to put mentor here, just we can put register. Because we defined top of the class.

    public String register(){




        return "mentor/register";

    }
    // localhost:8080/mentor/register
    @RequestMapping("/register")  // we didnt put /mentor before register. We aready defined.
    public String drop(){




        return "student/register";

    }
}
