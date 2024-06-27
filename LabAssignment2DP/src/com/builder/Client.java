package com.builder;

public class Client {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new SandwichMealBuilder();
        MealDirector director = new MealDirector();
        director.makeMeal(mealBuilder);
        Meal meal = mealBuilder.getMeal();
        System.out.println(meal.toString());
    }
}
