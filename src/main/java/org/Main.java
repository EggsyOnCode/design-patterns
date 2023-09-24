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
import org.creationalPatterns.Prototype.Animal;
import org.creationalPatterns.Prototype.AnimalFactory;
import org.creationalPatterns.Prototype.Sheep;
import org.structuralPatterns.Adapter.FancyAdapterClass;
import org.structuralPatterns.Adapter.FancyUI;
import org.structuralPatterns.Adapter.RestaurantUI;

public class Main {
    public static void main(String[] args) {
        FancyAdapterClass adapterClass = new FancyAdapterClass(new FancyUI());
        RestaurantUI restaurantUI = new RestaurantUI(adapterClass);
        restaurantUI.displayMenu();

    }
}