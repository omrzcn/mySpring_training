package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        return "home.html"; // its gonna return home.html from view resolver
    }

    @RequestMapping // if we write nothing its gonna go to home page again.
    public String home1(){
        return "home.html"; // its gonna return home.html from view resolver
    }

    @RequestMapping({"/apple","/orange"}) // we can achieve same home page with two different end points
    public String home3(){
        return "home.html"; // its gonna return home.html from view resolver
    }

}
