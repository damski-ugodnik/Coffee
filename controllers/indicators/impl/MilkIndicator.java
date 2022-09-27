package controllers.indicators.impl;

import controllers.indicators.ICoffeeMachineIndicator;
import models.CoffeeRecipe;
import models.Machine;

public class MilkIndicator implements ICoffeeMachineIndicator {
    @Override
    public String getSupplyName() {
        return "milk";
    }

    @Override
    public boolean isEnough(Machine coffeeMachine, CoffeeRecipe recipe) {
        return coffeeMachine.getMilk() >= recipe.milkPerCup();
    }
}
