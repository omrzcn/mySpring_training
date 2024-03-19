package com.cydeo.steretype_annotation.casefactory;



import org.springframework.stereotype.Component;
// i want to  send this class directly to the container
@Component
public class DellCase extends Case {


    public DellCase() {
        super("2208","Dell","240");
    }

    @Override
    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}
