package org.behavioralPatterns.Strategy;

public class Navigator {
    private RouteAlgo defaultRouteAlgo;

    public void CalcRoute(RouteAlgo algo){
        algo.calcRoute();
    }

    public void setDefaultRouteAlgo(RouteAlgo routeAlgo) {
        this.defaultRouteAlgo = routeAlgo;
    }
}
