package com.company;

public class Toyota extends Car {
    public Toyota(String color, String gearType) {
        super(color, gearType, "Toyota");
    }

    @Override
    public void steering() {
        super.steering();
        System.out.println("Toyota steering");
    }

    @Override
    public void changingGears() {
        super.changingGears();
        System.out.println("Toyota changing gears");
    }
}
