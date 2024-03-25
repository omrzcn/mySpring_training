package com.cydeo.beanPractice;

import org.springframework.context.annotation.Bean;


public class FullTimeEmployee implements Account {
    @Override
    public void CreateAccount() {
        System.out.println("Account created for full time");
    }
}
