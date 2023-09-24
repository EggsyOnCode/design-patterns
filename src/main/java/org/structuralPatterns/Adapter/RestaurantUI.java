package org.structuralPatterns.Adapter;

public class RestaurantUI implements RestaurantInterface{
    private final FancyAdapterClass adapterClass;

    public RestaurantUI(FancyAdapterClass adapterClass) {
        this.adapterClass = adapterClass;
    }

    @Override
    public void displayMenu() {
        int data = new DataServer().sendData();
        System.out.println(adapterClass.displayMenu(data)) ;
    }
}
