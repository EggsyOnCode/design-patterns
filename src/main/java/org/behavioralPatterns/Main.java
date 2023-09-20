package org.behavioralPatterns;

import org.behavioralPatterns.Memento.Editor;
import org.behavioralPatterns.Memento.History;
import org.behavioralPatterns.State.Context;
import org.behavioralPatterns.State.Selection;

public class Main {
    public static void main(String[] args) {
        Selection selection = new Selection();
        Context context = new Context();
        context.setCurrentTool(selection);

        context.mouseUp();

    }
}