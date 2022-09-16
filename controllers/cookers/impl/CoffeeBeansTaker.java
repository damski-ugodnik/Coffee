package controllers.cookers.impl;

import controllers.cookers.ICoffeeCooker;
import models.CoffeeRecipe;
import models.Machine;

public class CoffeeBeansTaker implements ICoffeeCooker {
    @Override
    public void makeCoffee(Machine coffeeMachine, CoffeeRecipe recipe) {
        coffeeMachine.takeCoffeeBeans(recipe.coffeeBeansPerCup());
    }
}
