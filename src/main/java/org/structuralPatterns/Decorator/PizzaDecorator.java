package org.structuralPatterns.Decorator;

public class PizzaDecorator implements Pizza{
    protected Pizza tempPizza;
    //protected so taht it's inherited classes can make ref ot it

    public PizzaDecorator(Pizza tempPizza) {
        this.tempPizza = tempPizza;
    }

    @Override
    public String getDesc() {
        return tempPizza.getDesc();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }

    public static void main(String[] args) {
        Pizza piz = new PlainPizza();
        PizzaDecorator mozDec = new Mozarella(piz);
        System.out.println(mozDec.getDesc());
        System.out.println(piz.getDesc());
    }
}
