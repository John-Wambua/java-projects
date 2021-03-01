package com.company;

public class Main {

    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom(
                new Bed(2,3,"wooden"),
                new Table(10,15,"brown"),
                new WallWindow(50,50,true));

        bedroom.getBed().makeBed();
        bedroom.getTable().moveTable();
        bedroom.getWallWindow().drawCurtains();
        bedroom.makeBed();
    }
}
