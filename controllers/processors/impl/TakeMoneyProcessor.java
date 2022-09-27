package controllers.processors.impl;

import controllers.processors.ICoffeeMachineProcessor;
import models.Machine;

public class TakeMoneyProcessor implements ICoffeeMachineProcessor {
    @Override
    public String getOperationTitle() {
        return "take";
    }

    @Override
    public void execute(Machine coffeeMachine) {
        int cash = coffeeMachine.takeMoney();
        System.out.printf("I gave you $%d\n", cash);
    }
}
