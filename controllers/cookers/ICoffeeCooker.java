package controllers.cookers;

import models.CoffeeRecipe;
import models.Machine;

public interface ICoffeeCooker {
    void makeCoffee(Machine coffeeMachine, CoffeeRecipe recipe);
}
