package com.builder;


public class Meal {
    public String sandwich;
    public String sideOrder;
    public String drink;
    public String offer;
    public double price;

    @Override
    public String toString() {
        return "Meal{" +
                "sandwich='" + sandwich + '\'' +
                ", sideOrder='" + sideOrder + '\'' +
                ", drink='" + drink + '\'' +
                ", offer='" + offer + '\'' +
                ", price=" + price +
                '}';
    }
}