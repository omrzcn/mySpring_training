package com.cydeo.beanPractice.config;

import com.cydeo.beanPractice.StringCydeo;
import com.cydeo.beanPractice.StringPractice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StringConfig {

    @Bean
    public StringCydeo stringCydeo(){
        return new StringCydeo();
    }
    @Bean
    public StringPractice stringPractice(){
        return new StringPractice();
    }

}
