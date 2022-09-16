package controllers.indicators.impl;

import controllers.indicators.ICoffeeMachineIndicator;
import models.CoffeeRecipe;
import models.Machine;

public class CupsIndicator implements ICoffeeMachineIndicator {
    @Override
    public String getSupplyName() {
        return "cups";
    }

    @Override
    public boolean isEnough(Machine coffeeMachine, CoffeeRecipe recipe) {
        return coffeeMachine.getDisposableCups() > 0;
    }
}
