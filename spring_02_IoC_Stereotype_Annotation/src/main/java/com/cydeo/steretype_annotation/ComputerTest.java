package com.cydeo.steretype_annotation;

import com.cydeo.steretype_annotation.config.PcConfig;
import com.cydeo.steretype_annotation.monitorfactory.Monitor;
import com.cydeo.steretype_annotation.monitorfactory.SonyMonitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);

        Monitor theMonitor = container.getBean(Monitor.class);
        System.out.println(theMonitor.getSize());





    }
}
