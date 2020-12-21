package com.adoger.builder;

import com.adoger.builder.burger.ChickenBurger;
import com.adoger.builder.burger.VegBurger;
import com.adoger.builder.drink.Coke;
import com.adoger.builder.drink.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
