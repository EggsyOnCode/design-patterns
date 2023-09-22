package org.creationalPatterns.Builder;

public class ApartmentBuilder implements Builder{
    private Apartment apartment;

    public ApartmentBuilder(){
        this.apartment = new Apartment();
    }
    @Override
    public void buildArchStyle() {
        apartment.setArchStyle("Modern feels!");
    }

    @Override
    public void buildBuildingSize() {
        apartment.setSize("Small for 3 persons!");
    }

    public Apartment getBuilding(){
        return  this.apartment;
    }
}
