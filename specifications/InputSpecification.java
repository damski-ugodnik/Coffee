package specifications;

import java.util.Set;

public record InputSpecification(String inputMessage, String invalidValueMessage, Set<String> possibleValues) {
    @Override
    public String inputMessage() {
        return inputMessage;
    }

    @Override
    public String invalidValueMessage() {
        return invalidValueMessage;
    }

    @Override
    public Set<String> possibleValues() {
        return possibleValues;
    }

}
