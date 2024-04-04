package com.cydeo.controller;

import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    // localhost:8080/mentor/register

   // @RequestMapping("/mentor/register") // we dont have to put mentor here, just we can put register. Because we defined top of the class.

    @GetMapping("/register") // gove me the page
    public String register(Model model){
        List<String> bacthList = List.of("JD1,JD2,JD3");
        model.addAttribute("batchList",bacthList);

        model.addAttribute("mentor",new Mentor());



        return "mentor/mentor-register";

    }





}
