package com.cydeo.bean_annotation.config;

import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.casefactory.DellCase;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import com.cydeo.bean_annotation.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotation.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComputerConfig {
    //created a class and annotated by @Configuration

    @Bean()
    public SonyMonitor monitorSony(){
        return new SonyMonitor("25 inc Beast","Sony",25);
    }

    @Bean
   public Motherboard motherboardAsus(){
        return new AsusMotherboard("BJ-200","Asus",4,6,"v2.44");
    }

    @Bean
    public Case caseDEll(){

        return new DellCase("220B","Dell","240");
    }




}
