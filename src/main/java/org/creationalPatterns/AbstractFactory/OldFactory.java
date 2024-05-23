package org.creationalPatterns.AbstractFactory;

public class OldFactory implements  AbstractFactory{
    @Override
    public Chair createChair() {
        return new OldChair();
    }

    @Override
    public Sofa createSofa() {
        return new OldSofa();
    }

}
