package org;

import org.behavioralPatterns.Observer.Channel;
import org.behavioralPatterns.Observer.ConcreteSubscriber;
import org.behavioralPatterns.Strategy.CabRoute;
import org.behavioralPatterns.Strategy.Navigator;
import org.behavioralPatterns.Strategy.WalkRoute;
import org.creationalPatterns.Builder.Builder;
import org.creationalPatterns.Builder.CastleBuilder;
import org.creationalPatterns.Builder.Director;
import org.creationalPatterns.Factory.OS;
import org.creationalPatterns.Factory.OSFactory;

public class Main {
    public static void main(String[] args) {
        Builder CastleBuilder = new CastleBuilder();
        Director director = new Director(CastleBuilder);

        director.makeBuilding();
        System.out.println(director.getBuilding());;
    }
}