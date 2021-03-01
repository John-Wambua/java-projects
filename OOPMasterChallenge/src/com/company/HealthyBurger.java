package com.company;

public class HealthyBurger extends Hamburger {
    private String addition5Name;
    private double addition5Price;

    private String addition6Name;
    private double addition6Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown rye", meat, price);
    }

    public void addHealthyBurgerAddition1(String name, double price){
        this.addition5Name = name;
        this.addition5Price = price;
    }
    public void addHealthyBurgerAddition2(String name, double price){
        this.addition6Name = name;
        this.addition6Price = price;
    }
    @Override
    public double totalPrice() {
        double healthyBurgerPrice =  super.totalPrice();
        if (this.addition5Name!=null){
            healthyBurgerPrice+=addition5Price;
            System.out.println("Added "+addition5Name+ " for an extra "+this.addition5Price);
        }
        if (this.addition6Name!=null){
            healthyBurgerPrice+=addition6Price;
            System.out.println("Added "+addition6Name+ " for an extra "+this.addition6Price);

        }
        return healthyBurgerPrice;
    }
}
