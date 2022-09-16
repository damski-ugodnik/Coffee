package models;


public class Machine {
    private boolean isOn;
    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int disposableCups = 9;
    private int money = 550;

    public Machine() {
        this.isOn = true;
    }

    public void work(String command){

    }

    public void showStats() {
        System.out.printf("\nThe coffee machine has:\n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n" +
                "%d disposable cups\n" +
                "$%d of money\n\n", water, milk, coffeeBeans, disposableCups, money);
    }

    public void payMoney(int price) {
        this.money += price;
    }

    public int takeMoney() {
        int cash = this.money;
        this.money = 0;
        return cash;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public void addWater(int water) {
        this.water += water;
    }

    public void addMilk(int milk) {
        this.milk += milk;
    }

    public void addCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans += coffeeBeans;
    }

    public void addDisposableCups(int disposableCups) {
        this.disposableCups += disposableCups;
    }

    public void takeWater(int water) {
        this.water -= water;
    }

    public void takeMilk(int milk) {
        this.milk -= milk;
    }

    public void takeCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans -= coffeeBeans;
    }

    public void takeCup() {
        this.disposableCups--;
    }

}
