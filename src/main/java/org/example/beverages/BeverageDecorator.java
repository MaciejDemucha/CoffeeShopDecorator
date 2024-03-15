package org.example.beverages;

public abstract class BeverageDecorator implements Beverage {
    protected Beverage beverage;
    protected int cost;
    protected String description;

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
