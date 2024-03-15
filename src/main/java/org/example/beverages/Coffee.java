package org.example.beverages;

public class Coffee implements Beverage {
    private int cost;
    private String description;

    public Coffee(int cost) {
        this.cost = cost;
        this.description = "coffee";
    }

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
