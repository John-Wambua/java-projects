package com.company;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "White", "Sausage & Bacon", 1400);
        super.addHamburgerAddition1("Chips", 200);
        super.addHamburgerAddition2("Drink", 150);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}

