package org.structuralPatterns.Composite;

public class ConcreteBox implements Box{
    private double price;

    public ConcreteBox(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
