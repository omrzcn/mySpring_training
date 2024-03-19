package com.cydeo.steretype_annotation.motherboardfactory;


import org.springframework.stereotype.Component;

// we added this class to Spring Container with Component
@Component
public class AsusMotherboard  extends Motherboard{

        public AsusMotherboard() {

            super("BJ-200","Asus",4,6,"v2.44");
        }

        public void loadProgram(String programName) {
            System.out.println("Program " + programName + " is now loading...");
        }

    }

