package models;

public record CoffeeRecipe(int waterPerCup, int milkPerCup, int coffeeBeansPerCup, int price) {
    @Override
    public int waterPerCup() {
        return waterPerCup;
    }

    @Override
    public int milkPerCup() {
        return milkPerCup;
    }

    @Override
    public int coffeeBeansPerCup() {
        return coffeeBeansPerCup;
    }

    @Override
    public int price() {
        return price;
    }
}
