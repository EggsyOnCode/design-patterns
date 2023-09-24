package org.structuralPatterns.Adapter;

public class FancyAdapterClass{
    private FancyUI fancyUI;

    public FancyAdapterClass(FancyUI fancyUI) {
        this.fancyUI = fancyUI;
    }

    public String displayMenu(int xmldata) {
        String data = Integer.toString(xmldata);
        return data;
    }

}
