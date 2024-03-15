package org.example.beverages;

public class Honey extends BeverageDecorator {

    private int cost;
    private String description = "honey";

    public Honey(Beverage beverage, int cost) {
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
