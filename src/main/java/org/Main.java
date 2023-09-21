package org;

import org.behavioralPatterns.Observer.Channel;
import org.behavioralPatterns.Observer.ConcreteSubscriber;
import org.behavioralPatterns.Strategy.CabRoute;
import org.behavioralPatterns.Strategy.Navigator;
import org.behavioralPatterns.Strategy.WalkRoute;
import org.creationalPatterns.Factory.OS;
import org.creationalPatterns.Factory.OSFactory;

public class Main {
    public static void main(String[] args) {
        OSFactory osfactory = new OSFactory();
        OS myOS = osfactory.getOS("Android");
        myOS.specs();

    }
}