package org.structuralPatterns.Composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box{
    private final List<Box> children = new ArrayList<>();

    public CompositeBox(Box... boxes){
        children.addAll(Arrays.asList(boxes));
    }
    @Override
    public double getPrice() {
        double sum = 0;
        for(Box items: children){
            sum += items.getPrice();
        }
        return sum;
    }

}
