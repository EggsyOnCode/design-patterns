package org.creationalPatterns.Prototype;

public interface Animal extends Cloneable{
    void setName(String name);
    String getName();
    Animal makeClone(Animal animalType);

}
