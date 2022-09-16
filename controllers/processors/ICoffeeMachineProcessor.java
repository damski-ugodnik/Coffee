package controllers.processors;

import models.Machine;

public interface ICoffeeMachineProcessor {
    String getOperationTitle();
    void execute(Machine coffeeMachine);
}
