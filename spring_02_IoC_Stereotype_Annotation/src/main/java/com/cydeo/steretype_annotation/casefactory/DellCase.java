package com.cydeo.steretype_annotation.casefactory;

public class DellCase extends Case {


    public DellCase() {
        super("2208","Dell","240");
    }

    @Override
    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }
}
