package utils;

import specifications.InputSpecification;
import specifications.IntegerInputSpecification;

public class InputValidator {

    public static boolean validateInt(String input) {
        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean validateRange(int value, IntegerInputSpecification specification) {
        return value >= specification.minValue() || value <= specification.maxValue();
    }

    public static boolean validateString(String input, InputSpecification specification) {
        return specification.possibleValues().contains(input);
    }
}
