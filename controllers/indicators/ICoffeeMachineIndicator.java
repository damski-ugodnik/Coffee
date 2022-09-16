package controllers.indicators;

import models.CoffeeRecipe;
import models.Machine;

public interface ICoffeeMachineIndicator {
    public String getSupplyName();

    public boolean isEnough(Machine coffeeMachine, CoffeeRecipe recipe);
}
