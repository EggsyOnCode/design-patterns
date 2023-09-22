package org.creationalPatterns.Builder;

public class Castle implements Building{
    private String style;
    private String size;
    @Override
    public void setArchStyle(String archStyle) {
        style = archStyle;
    }

    @Override
    public void setSize(String buildingSize) {
        size = buildingSize;
    }

    public String getStyle() {
        return style;
    }

    public String getSize() {
        return size;
    }
}
