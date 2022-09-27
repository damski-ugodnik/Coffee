package utils;

import specifications.InputSpecification;
import specifications.IntegerInputSpecification;

import java.util.Scanner;

public class ConsoleReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static int readInteger(IntegerInputSpecification specification) {
        String input;
        while (true) {
            System.out.println(specification.inputMessage());
            input = scanner.next();
            if (InputValidator.validateInt(input)) {
                int result = Integer.parseInt(input);
                if (InputValidator.validateRange(result, specification)) {
                    return result;
                }
            }
            System.out.println(specification.invalidValueMessage());
        }
    }

    public static String readCommands(InputSpecification specification) {
        String input;
        while (true) {
            System.out.print(specification.inputMessage() + "\n");
            input = scanner.next();
            if (InputValidator.validateString(input, specification)) {
                return input;
            }
            System.out.println(specification.invalidValueMessage());
        }
    }

}
