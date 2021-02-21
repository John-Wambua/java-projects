package com.company;

public class Main {

    public static void main(String[] args) {
	Vehicle vehicle = new Vehicle("Red", 4,"Manual");
	Car car = new Car("Green","Auto", "Mercedes");
	Toyota toyota = new Toyota("Black", "Manual");
	System.out.println("Car type "+car.getCarType());
	System.out.println("Car Gear type "+car.getGearType());
	System.out.println("Car color "+car.getColor());
	System.out.println("Toyota gear type "+toyota.getGearType());
	System.out.println("Toyota Color "+toyota.getColor());
	System.out.println("Toyota type "+toyota.getCarType());
	System.out.println("Toyota tyres "+toyota.getTyres());

	car.changingGears();
	vehicle.changingGears();

	vehicle.getColor();
    }
}
