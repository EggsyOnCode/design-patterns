package org.behavioralPatterns.Memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state){
        states.add(state);
    }

    public EditorState pop(){
        int index = states.size() - 1;
        var lastState =  states.get(index);
        states.remove(index);
        return lastState;
    }

}
