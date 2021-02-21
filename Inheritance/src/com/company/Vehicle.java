package com.company;

public class Vehicle {
    private String color;
    private int tyres;
    private String gearType;

    public Vehicle(String color, int tyres, String gearType) {
        this.color = color;
        this.tyres = tyres;
        this.gearType = gearType;
    }
    public void steering(){
        System.out.println("Vehicle steering");
    }
    public void changingGears(){
        System.out.println("Vehicle Changing Gears");
    }

    public String getColor() {
        return color;
    }

    public int getTyres() {
        return tyres;
    }

    public String getGearType() {
        return gearType;
    }
}
