package com.leandergebhardt.hungrybits;

public class Dish {

    String name;
    String description;
    double price;

    public Dish(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name: " + this.name + "\n" +
                "description: " + this.description + "\n" +
                "price: " + this.price + "€";
    }
}
