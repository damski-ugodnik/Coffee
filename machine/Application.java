package machine;

import controllers.processors.ICoffeeMachineProcessor;
import controllers.processors.ProcessorFactory;
import models.Machine;
import utils.ConsoleReader;

public class Application {
    private final Machine coffeeMachine;
    private final ProcessorFactory factory;

    public Application(ProcessorFactory factory, Machine coffeeMachine) {
        this.factory = factory;
        this.coffeeMachine = coffeeMachine;
    }

    public void run() {
        ICoffeeMachineProcessor processor;
        while (coffeeMachine.isOn()) {
            processor = factory.getProcessor(ConsoleReader.readCommands(factory.getSpecification()));
            processor.execute(coffeeMachine);
        }

    }
}
