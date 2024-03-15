package org.example.beverages;

public class Tea implements Beverage {
    private int cost;
    private String description;

    public Tea(int cost) {
        this.cost = cost;
        this.description = "tea";
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
