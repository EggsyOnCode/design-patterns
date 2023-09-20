package org.behavioralPatterns.State;

public class Selection extends Tool{
    @Override
    public void mouseUp() {
        System.out.println("rectangle is being shaped up!");
    }

    @Override
    public void mouseDown() {
        System.out.println("Square is being shaped down!");
    }
}
