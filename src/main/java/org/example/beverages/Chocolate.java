package org.example.beverages;

public class Chocolate extends BeverageDecorator{
    private int cost;
    private String description = "chocolate";

    public Chocolate(Beverage beverage, int cost) {
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
