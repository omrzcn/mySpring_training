package com.cydeo.streotype_annotation;

import com.cydeo.streotype_annotation.casefactory.Case;
import com.cydeo.streotype_annotation.config.PcConfig;
import com.cydeo.streotype_annotation.monitorfactory.Monitor;
import com.cydeo.streotype_annotation.monitorfactory.SonyMonitor;
import com.cydeo.streotype_annotation.motherboardfactory.Motherboard;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(PcConfig.class);

       PC myPc = container.getBean(PC.class);
        System.out.println(myPc.getMonitor().getManufacturer());


    }
}
