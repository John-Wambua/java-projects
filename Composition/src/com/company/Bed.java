package com.company;

public class Bed {
    private int numOfPillows;
    private int numOfBlankets;
    private String material;

    public Bed(int numOfPillows, int numOfBlankets, String material) {
        this.numOfPillows = numOfPillows;
        this.numOfBlankets = numOfBlankets;
        this.material = material;
    }

    public void makeBed(){
        System.out.println("Making the Bed");
    }

    public int getNumOfPillows() {
        return numOfPillows;
    }

    public int getNumOfBlankets() {
        return numOfBlankets;
    }

    public String getMaterial() {
        return material;
    }
}
