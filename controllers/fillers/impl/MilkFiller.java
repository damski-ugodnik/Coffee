package controllers.fillers.impl;

import models.Machine;
import controllers.fillers.ICoffeeMachineFiller;
import specifications.IntegerInputSpecification;
import utils.ConsoleReader;

public class MilkFiller implements ICoffeeMachineFiller {
    private final IntegerInputSpecification specification = new IntegerInputSpecification(
            "Write how many ml of milk you want to add:",
            "Invalid number", Integer.MAX_VALUE, 0);

    @Override
    public void fillSupply(Machine coffeeMachine) {
        int value = ConsoleReader.readInteger(specification);
        coffeeMachine.addMilk(value);
    }
}
