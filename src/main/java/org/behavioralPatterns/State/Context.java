package org.behavioralPatterns.State;

public class Context {
    private Tool currentTool;


    public void mouseUp(){
        currentTool.mouseUp();
    }

    public void mouseDown(){
        currentTool.mouseDown();
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
