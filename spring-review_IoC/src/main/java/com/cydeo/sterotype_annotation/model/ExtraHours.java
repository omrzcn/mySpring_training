package com.cydeo.sterotype_annotation.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Component
public class ExtraHours {

   public Integer extraHours(){
       return 10;
   }

}
