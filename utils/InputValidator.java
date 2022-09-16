package utils;

import specifications.InputSpecification;
import specifications.IntegerInputSpecification;

public class InputValidator {

    public static boolean validateInt(String input, IntegerInputSpecification specification) {
        try {
            int value = Integer.parseInt(input);
            return specification.maxValue() >= value && specification.minValue() <= value;
        } catch (NumberFormatException exception) {
            return false;
        }
    }

    public static boolean validateString(String input, InputSpecification specification) {
        return specification.possibleValues().contains(input);
    }
}
