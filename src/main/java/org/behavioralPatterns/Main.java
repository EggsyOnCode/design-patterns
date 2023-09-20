package org.behavioralPatterns;

import org.behavioralPatterns.Observer.Channel;
import org.behavioralPatterns.Observer.ConcreteSubscriber;

public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel("Telusko");
        ConcreteSubscriber sub1 = new ConcreteSubscriber("Akshit");
        ConcreteSubscriber sub2 = new ConcreteSubscriber("Tanmay");
        ConcreteSubscriber sub3 = new ConcreteSubscriber("Rahul");

        channel.subscribe(sub1, sub2, sub3);

        channel.notifySubscribers("Video on Philosophy is here!");


    }
}