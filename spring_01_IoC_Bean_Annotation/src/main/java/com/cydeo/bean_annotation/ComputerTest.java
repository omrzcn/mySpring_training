package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.casefactory.Case;

import com.cydeo.bean_annotation.config.ComputerConfig;
import com.cydeo.bean_annotation.config.RandomConfig;
import com.cydeo.bean_annotation.monitorfactory.Monitor;

import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ComputerTest {
    public static void main(String[] args) {


        System.out.println("Creating Container");

        //Creating container by using Application Context
        // we will always use annotationconfigapplicationcontext

        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class, RandomConfig.class); // we added our Configuration to the Container. Nice!!!


        // lets create our PC

        // --- We are getting the bean from container and than we are gonna add them our PC object.

        Monitor monitor = container.getBean(Monitor.class);
        Case case1 = container.getBean(Case.class);
        Motherboard motherboard = container.getBean(Motherboard.class);


        PC myPc = new PC(case1, monitor, motherboard);
        myPc.powerUp();


    }

}
