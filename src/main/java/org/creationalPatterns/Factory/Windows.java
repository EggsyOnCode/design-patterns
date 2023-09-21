package org.creationalPatterns.Factory;

public class Windows implements OS{
    @Override
    public void specs() {
        System.out.println("Beware of unaccounced upadtes!");
    }
}
