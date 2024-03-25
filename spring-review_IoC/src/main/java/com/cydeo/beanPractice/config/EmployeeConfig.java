package com.cydeo.beanPractice.config;

import com.cydeo.beanPractice.FullTimeEmployee;
import com.cydeo.beanPractice.PartTimeEmployee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

    @Bean
    public FullTimeEmployee fullTimeEmployee(){

        return new FullTimeEmployee();
    }
    @Bean
    public PartTimeEmployee partTimeEmployee(){
        return new PartTimeEmployee();
    }
}
