package com.cydeo;

import com.cydeo.beanPractice.FullTimeEmployee;
import com.cydeo.beanPractice.PartTimeEmployee;
import com.cydeo.beanPractice.StringCydeo;
import com.cydeo.beanPractice.StringPractice;
import com.cydeo.beanPractice.config.EmployeeConfig;
import com.cydeo.beanPractice.config.StringConfig;
import com.cydeo.sterotype_annotation.config.AppConfig;
import com.cydeo.sterotype_annotation.model.DataStructure;
import com.cydeo.sterotype_annotation.model.ExtraHours;
import com.cydeo.sterotype_annotation.model.Microservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(EmployeeConfig.class, StringConfig.class, AppConfig.class);

        FullTimeEmployee fullTimeEmployee = container.getBean(FullTimeEmployee.class);
        fullTimeEmployee.CreateAccount();
        PartTimeEmployee partTimeEmployee = container.getBean(PartTimeEmployee.class);
        partTimeEmployee.CreateAccount();

        StringCydeo stringCydeo = container.getBean(StringCydeo.class);
        stringCydeo.myString();
        StringPractice stringPractice = container.getBean(StringPractice.class);
        stringPractice.myString2();


        DataStructure dataStructure = container.getBean(DataStructure.class);
        dataStructure.getTotalHours();
        dataStructure.getTotalHoursby(new ExtraHours());
        Microservice microservice = container.getBean(Microservice.class);
        microservice.getTotalHours();


    }
}
