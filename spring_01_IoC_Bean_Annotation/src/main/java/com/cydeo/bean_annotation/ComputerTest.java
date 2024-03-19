package com.cydeo.bean_annotation;

import com.cydeo.bean_annotation.casefactory.Case;

import com.cydeo.bean_annotation.config.ComputerConfig;
import com.cydeo.bean_annotation.config.RandomConfig;
import com.cydeo.bean_annotation.monitorfactory.AcerMonitor;
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


        System.out.println("==================Retrieving Multiple Objects From Container");
        // there are 2 sony monitor in config class. Im gonna bring one which i gave a name


        // These are types how to call beans.

        Monitor theMonitor = container.getBean("monitorSony",Monitor.class); // Default Bean Name
        Monitor theMonitor1 = container.getBean("sony",Monitor.class); // Custom Bean Name
        Monitor theMonitor2 = container.getBean(Monitor.class);  // @Primary






    }

}
