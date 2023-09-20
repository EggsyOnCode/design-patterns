package org.behavioralPatterns.State;

public class Brush extends Tool{
    @Override
    public void mouseUp() {
        System.out.println("Red color is being brushed over the screen!");
    }

    @Override
    public void mouseDown() {
        System.out.println("Blue color is being brushed over and under the screen!");
    }
}
