package com.builder;

public class SandwichMealBuilder implements MealBuilder {

    private Meal  _meal;

    public SandwichMealBuilder() {
        _meal = new Meal();
    }

    @Override
    public void addSandwich(String sandwich) {
        _meal.sandwich = sandwich;
    }

    @Override
    public void addSides(String sides) {
        _meal.sideOrder = sides;
    }

    @Override
    public void addDrink(String drink) {
        _meal.drink = drink;
    }

    @Override
    public void addOffer(String coupon) {
        _meal.offer = coupon;
    }

    @Override
    public void setPrice(double price) {
        _meal.price = price;
    }

    @Override
    public Meal getMeal() {
        return _meal;
    }
}
