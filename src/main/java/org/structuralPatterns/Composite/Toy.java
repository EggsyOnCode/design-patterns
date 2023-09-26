package org.structuralPatterns.Composite;

public class Toy implements Product{

    private double price;

    public Toy(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
