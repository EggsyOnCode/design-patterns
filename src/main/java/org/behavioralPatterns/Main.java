package org.behavioralPatterns;

import org.behavioralPatterns.Observer.Channel;
import org.behavioralPatterns.Observer.ConcreteSubscriber;
import org.behavioralPatterns.Strategy.CabRoute;
import org.behavioralPatterns.Strategy.Navigator;
import org.behavioralPatterns.Strategy.WalkRoute;

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();
        navigator.setDefaultRouteAlgo(new CabRoute());
        navigator.CalcRoute(new WalkRoute());

    }
}