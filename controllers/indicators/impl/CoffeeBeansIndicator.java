package controllers.indicators.impl;

import controllers.indicators.ICoffeeMachineIndicator;
import models.CoffeeRecipe;
import models.Machine;

public class CoffeeBeansIndicator implements ICoffeeMachineIndicator {
    @Override
    public String getSupplyName() {
        return "coffee beans";
    }

    @Override
    public boolean isEnough(Machine coffeeMachine, CoffeeRecipe recipe) {
        return coffeeMachine.getCoffeeBeans() >= recipe.coffeeBeansPerCup();
    }
}
