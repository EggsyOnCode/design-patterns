package org.structuralPatterns.Decorator;

public class Mozarella extends PizzaDecorator {
    public Mozarella(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("adding moz");
    }
    //super keyword means that mozarella class is calling pizzadecorator's constructor and passing tempPizza obj to it for decorator class to ini and store a ref to it
    public String getDesc(){
        return tempPizza.getDesc()+ ", Mozarella";
    }

    @Override
    public double getCost() {
        return super.getCost() + 4.5;
    }
}
