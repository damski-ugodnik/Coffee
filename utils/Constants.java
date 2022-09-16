package utils;

import models.RecipeProvider;
import specifications.InputSpecification;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Constants {
    public static final InputSpecification PURCHASE_SPECIFICATION =
            new InputSpecification("What do you want to buy? " + RecipeProvider.valuesToString() + ":",
                    "No such recipe",
                    configurePurchasePossibleValues());


    private static Set<String> configurePurchasePossibleValues() {
        Set<String> values = Arrays.stream(RecipeProvider.values()).map(RecipeProvider::getTitle).collect(Collectors.toSet());
        values.add("back");
        return values;
    }
}
