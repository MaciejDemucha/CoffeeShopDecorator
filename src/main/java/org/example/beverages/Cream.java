package org.example.beverages;

public class Cream extends BeverageDecorator{
    private int cost;
    private String description = "cream";

    public Cream(Beverage beverage, int cost) {
        super.beverage = beverage;
        this.description = beverage.getDescription() + " topped with " + this.description;
        this.cost = beverage.getCost() + cost;
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
