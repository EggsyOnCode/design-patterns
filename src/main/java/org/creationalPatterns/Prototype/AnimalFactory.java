package org.creationalPatterns.Prototype;

public class AnimalFactory {
    public Animal getClone(Animal animalType){
        return animalType.makeClone(animalType);
    }
}
