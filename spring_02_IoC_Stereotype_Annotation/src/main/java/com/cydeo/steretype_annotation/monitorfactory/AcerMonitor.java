package com.cydeo.steretype_annotation.monitorfactory;

import org.springframework.stereotype.Component;

@Component
public class AcerMonitor extends Monitor{
    public AcerMonitor() {
        super("22 inch beast","Sony",23);
    }

    @Override
    public void drawPixelAt() {
        System.out.println("Drawing pixel with Acer");
    }
}
