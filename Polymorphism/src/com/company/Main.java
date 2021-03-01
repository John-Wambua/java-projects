package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            Car car = randomCar();
            System.out.println("Car # "+i +"\n"+
                    "Car name is " + car.getName() + "\n" +
                    "Number of wheels: " + car.getWheels() + "\n" +
                    "Accelerate: " + car.accelerate());
        }
    }
    public static Car randomCar(){
            int randomNumber = (int) (Math.random() * 3) + 1;
            System.out.println("Random number is " + randomNumber);
            switch (randomNumber){
                case 1:
                    return new Toyota();
                case 2:
                    return new Mercedes();
                case 3:
                    return new CustomCar();
            }

        return null;
    }
}

class Toyota extends Car{

    public Toyota() {
        super("Toyota", 1);
    }

    @Override
    public String startEngine() {
        return "Toyota engine starting";
    }

    @Override
    public String accelerate() {
        return "Toyota accelerating";
    }

    @Override
    public String brake() {
        return "Toyota braking!";
    }
}

class Mercedes extends Car{

    public Mercedes() {
        super("Mercedes", 3);
    }

    @Override
    public String startEngine() {
        return "Mercedes engine starting";
    }

    @Override
    public String accelerate() {
        return "Mercedes Accelerating";
    }

    @Override
    public String brake() {
        return "Mercedes Braking";
    }
}

class CustomCar extends Car{

    public CustomCar() {
        super("Custom Car", 5);
    }
}

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }
    public String startEngine(){
        return "Car engine is starting";
    }
    public String accelerate(){
        return "Car Accelerating";
    }
    public String brake(){
        return "Car Braking!";
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}
