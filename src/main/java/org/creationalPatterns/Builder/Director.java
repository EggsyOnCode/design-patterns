package org.creationalPatterns.Builder;

public class Director {
    private Builder builder;

    public Director(Builder builderChoice){
        this.builder = builderChoice;
    }

    public Building getBuilding(){
        return this.builder.getBuilding();
    }

    public void makeBuilding(){
        this.builder.buildArchStyle();
        this.builder.buildBuildingSize();
    }
}
