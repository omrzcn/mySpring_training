package com.cydeo.streotype_annotation.casefactory;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@ToString
public abstract class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;

   @Autowired // this is field auto wiring
   private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
    }

    public abstract void pressPowerButton();

}
