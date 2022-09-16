package controllers.processors;

import specifications.InputSpecification;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProcessorFactory {
    private final InputSpecification specification;
    private final Map<String, ICoffeeMachineProcessor> processors;

    public ProcessorFactory(List<ICoffeeMachineProcessor> processorsList) {
        this.processors = processorsList.stream().collect(Collectors.toMap(ICoffeeMachineProcessor::getOperationTitle, Function.identity()));
        Set<String> operationNames = new HashSet<>();

        for (ICoffeeMachineProcessor coffeeMachineProcessor : processorsList) {
            operationNames.add(coffeeMachineProcessor.getOperationTitle());
        }

        this.specification = new InputSpecification(String.format("Write action (%s):",String.join(", ", operationNames)) , "Invalid operation", operationNames);
    }

    public ICoffeeMachineProcessor getProcessor(String operation) {
        ICoffeeMachineProcessor processor = processors.get(operation);
        if (processor == null) {
            throw new IllegalArgumentException("No such operation");
        }
        return processor;
    }

    public InputSpecification getSpecification() {
        return specification;
    }
}
