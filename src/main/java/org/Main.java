package org;
import org.structuralPatterns.Composite.CompositeBox;
import org.structuralPatterns.Composite.ConcreteBox;
import org.structuralPatterns.Composite.Product;
import org.structuralPatterns.Composite.Toy;

public class Main {
    public static void main(String[] args) {
        Product toy = new Toy(56);
        ConcreteBox concreteBox = new ConcreteBox(45.6);
        CompositeBox compositeBox = new CompositeBox(toy, concreteBox);
        System.out.println(compositeBox.getPrice());

    }
}