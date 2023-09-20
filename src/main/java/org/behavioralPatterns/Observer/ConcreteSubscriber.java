package org.behavioralPatterns.Observer;

public class ConcreteSubscriber implements Subscriber{
    private String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }


    @Override
    public void update(String desc, String channel) {
        System.out.println("HI " + name+", " + channel + " has uploaded video titled: "+ desc);
    }
}
