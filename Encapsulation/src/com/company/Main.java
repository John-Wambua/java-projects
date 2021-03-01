package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(1, false);
        System.out.println("Toner Amount "+printer.getTonerLevel());
        System.out.println("Adding Toner "+printer.fillToner(100));
        System.out.println("Print pages "+printer.print(5));
        System.out.println("Pages printed "+printer.getNumberOfPages());
    }
}
