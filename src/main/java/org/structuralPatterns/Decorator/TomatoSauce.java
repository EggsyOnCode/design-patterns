package org.structuralPatterns.Decorator;

public class TomatoSauce extends PizzaDecorator {
    public TomatoSauce(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("adding tom");
    }
    //super keyword means that mozarella class is calling pizzadecorator's constructor and passing tempPizza obj to it for decorator class to ini and store a ref to it
    public String getDesc(){
        return tempPizza.getDesc()+ ", TomatoSauce";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.5;
    }
}
