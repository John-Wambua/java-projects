package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "White","Sausage",500);
        hamburger.addHamburgerAddition1("chips", 200);
        hamburger.addHamburgerAddition2("cheese", 200);
        System.out.println("Total price is "+hamburger.totalPrice());

        HealthyBurger healthyBurger = new HealthyBurger("beef", 650);
        healthyBurger.addHealthyBurgerAddition1("Tomato", 100);
        System.out.println("Total Price "+ healthyBurger.totalPrice());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("Total price "+deluxeBurger.totalPrice());
    }
}
