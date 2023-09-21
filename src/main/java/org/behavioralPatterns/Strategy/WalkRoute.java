package org.behavioralPatterns.Strategy;

public class WalkRoute implements RouteAlgo{
    @Override
    public void calcRoute() {
        System.out.println("Calculating Route for walkers!");
    }
}
