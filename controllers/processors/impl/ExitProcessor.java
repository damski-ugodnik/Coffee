package controllers.processors.impl;

import controllers.processors.ICoffeeMachineProcessor;
import models.Machine;

public class ExitProcessor implements ICoffeeMachineProcessor {
    @Override
    public String getOperationTitle() {
        return "exit";
    }

    @Override
    public void execute(Machine coffeeMachine) {
        coffeeMachine.setOn(false);
    }
}
