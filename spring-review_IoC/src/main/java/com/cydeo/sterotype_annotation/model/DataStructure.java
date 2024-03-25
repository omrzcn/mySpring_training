package com.cydeo.sterotype_annotation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component


public class DataStructure {
    private ExtraHours extraHours;

    @Autowired
    public DataStructure(ExtraHours extraHours) {
        this.extraHours = extraHours;
    }

    public void getTotalHours(){
        System.out.println("Total hours "+20);
    }
  public void getTotalHoursby(ExtraHours extraHours){
      System.out.println("Total Hours: "+(45+(extraHours.extraHours())));
  }
}
