package org.creationalPatterns.Builder;

public class CastleBuilder implements Builder{
    private Castle castle;

    public CastleBuilder(){
        this.castle = new Castle();
    }
    @Override
    public void buildArchStyle() {
        castle.setArchStyle("Gothic style!");
    }

    @Override
    public void buildBuildingSize() {
        castle.setSize("Large ; 50 canals!");
    }

    @Override
    public Castle getBuilding() {
        return castle;
    }
}
