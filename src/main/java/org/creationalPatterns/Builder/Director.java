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

    public static void main(String[] args) {
        ApartmentBuilder aptBuilder = new ApartmentBuilder();
        Director director = new Director(aptBuilder);
        director.makeBuilding();
        Building build = director.getBuilding();
        System.out.println(build.getStyle());
    }
}


