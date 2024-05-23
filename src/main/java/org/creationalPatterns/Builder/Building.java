package org.creationalPatterns.Builder;

public interface Building {
    void setArchStyle(String archStyle);
    void setSize(String size);

    String getStyle();
    String getSize();
}
