package org.structuralPatterns.Decorator;

public class PlainPizza implements Pizza{

    @Override
    public String getDesc() {
        return ("Ingredient: Dough ");
    }

    @Override
    public double getCost() {
        return 5.5;
    }
}
