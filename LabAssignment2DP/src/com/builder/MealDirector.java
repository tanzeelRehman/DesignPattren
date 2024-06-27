package com.builder;


public class MealDirector {

    public void makeMeal(MealBuilder mealBuilder) {

        mealBuilder.addSandwich("Chicken");
        mealBuilder.addSides("Chips");
        mealBuilder.addDrink("Pepsi");
        mealBuilder.addOffer("Daraz 11 / 11 sale");
        mealBuilder.setPrice(100);
    }
}