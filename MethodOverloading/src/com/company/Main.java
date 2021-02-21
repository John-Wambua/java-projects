package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(100));
        System.out.println(getDurationString(61,30));
        System.out.println(getDurationString(3897));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet <0 || inches <0 || inches >12){
            return -1;
        }
        double feetToInches = feet*12;
        double totalInches = inches + feetToInches;

        return totalInches * 2.54;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches<0){
            return -1;
        }
        double feet =(int) inches / 12;
        double inchesLeft = (int) inches%12;
        return calcFeetAndInchesToCentimeters(feet, inchesLeft);

    }

    public static String  getDurationString(int minutes, int seconds){
        if (minutes<0 || seconds<0 || seconds>59){
            return "Invalid value";
        }
        int totalSeconds = (minutes * 60) + seconds;

        int hours = totalSeconds/3600;
        int minutesLeft = (totalSeconds%3600)/60;
        int secondsLeft = (totalSeconds%3600)%60;

        return hours+ "h "+minutesLeft+"m "+secondsLeft+" s";
    }

    public static String  getDurationString(int seconds){
        if (seconds<0){
            return "Invalid value";
        }
        int minutes = seconds/60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }


    }
