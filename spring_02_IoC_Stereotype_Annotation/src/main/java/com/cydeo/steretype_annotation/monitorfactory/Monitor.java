package com.cydeo.steretype_annotation.monitorfactory;

public abstract class Monitor {
    private String make;
    private String manufacturer;
    private int size;

    public Monitor(String make, String manufacturer, int size) {
        this.make = make;
        this.manufacturer = manufacturer;
        this.size = size;
    }


    public abstract void drawPixelAt();
}
