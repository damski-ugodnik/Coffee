package controllers.processors.impl;

import controllers.processors.ICoffeeMachineProcessor;
import models.Machine;

public class RemainderProcessor implements ICoffeeMachineProcessor {
    @Override
    public String getOperationTitle() {
        return "remaining";
    }

    @Override
    public void execute(Machine coffeeMachine) {
        coffeeMachine.showStats();
    }
}
