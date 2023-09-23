package org.creationalPatterns.Prototype;

public class Sheep implements Animal{
    private String name;
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Animal makeClone(Animal animalType) {
        System.out.println("sheep is being cloned!");
        Sheep clonedSheep;
        try {
            clonedSheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return clonedSheep;

    }

    public String getName() {
        return name;
    }
}
