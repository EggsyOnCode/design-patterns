package org.creationalPatterns.AbstractFactory;

import java.util.Scanner;

public class Application {
    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
    }

    private AbstractFactory factory;

    Chair getChair(){
        return factory.createChair();
    }

    Sofa getSofa(){
        return factory.createSofa();
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Application app = new Application();
        System.out.println("Enter type of factory");
        String input = myObj.next();
        if (input.equalsIgnoreCase("modern")){
            app.setFactory(new ModernFactory());
        } else if (input == "Old") {
            app.setFactory(new OldFactory());
        }
        Sofa sof = app.getSofa();
        System.out.println(sof.getLeatherType());
    }
}
