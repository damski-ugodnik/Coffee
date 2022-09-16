package controllers.processors.impl;

import controllers.cookers.ICoffeeCooker;
import controllers.indicators.ICoffeeMachineIndicator;
import controllers.processors.ICoffeeMachineProcessor;
import models.CoffeeRecipe;
import models.Machine;
import models.RecipeProvider;
import utils.ConsoleReader;
import utils.Constants;

import java.util.List;

public class BuyCoffeeProcessor implements ICoffeeMachineProcessor {

    private final List<ICoffeeCooker> cookers;
    private final List<ICoffeeMachineIndicator> indicators;

    public BuyCoffeeProcessor(List<ICoffeeCooker> cookers, List<ICoffeeMachineIndicator> indicators) {
        this.cookers = cookers;
        this.indicators = indicators;
    }

    @Override
    public String getOperationTitle() {
        return "buy";
    }

    @Override
    public void execute(Machine coffeeMachine) {
        String title = ConsoleReader.readCommands(Constants.PURCHASE_SPECIFICATION);
        if(title.equals("back")){
            return;
        }
        RecipeProvider coffee = RecipeProvider.fromTitle(title);
        CoffeeRecipe recipe = coffee.getRecipe();
        if (!isResourcesEnough(coffeeMachine, recipe)) {
            return;
        }
        System.out.println("I have enough resources, making you a coffee!");
        for (ICoffeeCooker cooker : cookers) {
            cooker.makeCoffee(coffeeMachine, recipe);
        }
    }

    private boolean isResourcesEnough(Machine coffeeMachine, CoffeeRecipe recipe) {
        for (ICoffeeMachineIndicator indicator : indicators) {
            if (!indicator.isEnough(coffeeMachine, recipe)) {
                System.out.printf("Sorry, not enough %s!\n", indicator.getSupplyName());
                return false;
            }
        }
        return true;
    }
}
