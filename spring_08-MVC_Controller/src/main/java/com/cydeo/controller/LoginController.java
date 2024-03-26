package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // this annotation send this class to handle mapping.
public class LoginController {

    @RequestMapping("/login")
    public String getLoginPage(){

        return "login.html";
    }

    @RequestMapping("/dom")
    public String getLoginPage2(){

        return "login.html";
    }

}
