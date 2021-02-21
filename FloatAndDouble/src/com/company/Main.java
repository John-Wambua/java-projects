package com.company;

import javax.sql.DataSource;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float Min "+myMinFloatValue);
        System.out.println("Float Max "+myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double Min "+myMinDoubleValue);
        System.out.println("Double Max "+myMaxDoubleValue);

        int myIntValue=5/3;
        float myFloatValue=5f/3f;
        double myDoubleValue=5d/3d;
        System.out.println("float value "+ myFloatValue);
        System.out.println("int value "+ myIntValue);
        System.out.println("double value "+ myDoubleValue);


        double pounds = 150d;
        double kg = pounds *0.45359237d;
        System.out.println("Kgs: "+kg);
    }
}
