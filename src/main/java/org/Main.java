package org;
import org.structuralPatterns.Decorator.Mozarella;
import org.structuralPatterns.Decorator.Pizza;
import org.structuralPatterns.Decorator.PlainPizza;
import org.structuralPatterns.Decorator.TomatoSauce;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new TomatoSauce(new Mozarella(new PlainPizza()));
        // how is this chaining working!?
        System.out.println(pizza.getDesc());
    }
}