package com.builder;

public interface MealBuilder {
    void addSandwich(String item);
    void addSides(String item);
    void addDrink(String item);
    void addOffer(String item);
    void setPrice(double price);

    Meal getMeal();
}
