package controllers.indicators.impl;

import controllers.indicators.ICoffeeMachineIndicator;
import models.CoffeeRecipe;
import models.Machine;

public class WaterIndicator implements ICoffeeMachineIndicator {
    @Override
    public String getSupplyName() {
        return "water";
    }

    @Override
    public boolean isEnough(Machine coffeeMachine, CoffeeRecipe recipe) {
        return coffeeMachine.getWater() >= recipe.waterPerCup();
    }
}
