package org.behavioralPatterns.Strategy;

public class CabRoute implements RouteAlgo{
    @Override
    public void calcRoute() {
        System.out.println("calculating route via Cab!");
    }
}
