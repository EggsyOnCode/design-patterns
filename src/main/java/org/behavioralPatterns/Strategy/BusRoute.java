package org.behavioralPatterns.Strategy;

public class BusRoute implements RouteAlgo{
    @Override
    public void calcRoute() {
        System.out.println("Calculating route via Bus!");
    }
}
