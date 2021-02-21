package com.company;

public class Car extends Vehicle {

    private String carType;

    public Car(String color, String gearType, String carType) {
        super(color, 4, gearType);
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }

    @Override
    public void steering() {
        super.steering();
        System.out.println("Car Steering");
    }

    @Override
    public void changingGears() {
        super.changingGears();
        System.out.println("Car changing Gears");
    }
}
