package org.example;

import org.example.beverages.*;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee(60);
        BeverageDecorator coffeeWithCream = new Cream(coffee, 25);
        BeverageDecorator coffeeWithCreamAndChocolate = new Chocolate(coffeeWithCream, 25);
        System.out.println(coffeeWithCreamAndChocolate.getCost());
        System.out.println(coffeeWithCreamAndChocolate.getDescription());
    }
}