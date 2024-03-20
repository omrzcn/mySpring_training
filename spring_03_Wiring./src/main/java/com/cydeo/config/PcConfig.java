package com.cydeo.config;

import com.cydeo.casefactory.Case;
import com.cydeo.casefactory.DellCase;
import com.cydeo.casefactory.Dimensions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PcConfig {

    @Bean
    public Dimensions dimensions(){ // we created this dimension apart from case dell and use it below @Bean
        return new Dimensions(50,10,10);
    }

    @Bean
    public Case caseDell(Dimensions dimensions){ // THIS IS WIRING.
        return new DellCase("220B","Dell","240",dimensions);
    }


}
