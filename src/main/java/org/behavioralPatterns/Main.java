package org.behavioralPatterns;

import org.behavioralPatterns.Memento.Editor;
import org.behavioralPatterns.Memento.History;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();
        editor.setContent("hello world");
        history.push(editor.createState());

        editor.setContent("I am good, i am feeling alright!");
        history.push(editor.createState());

        editor.setContent("Creator is HERE!");
        history.push(editor.createState());
        editor.restoreState(history.pop()); // should print last entry "creator is here!"


        System.out.println(editor.getContent());

    }
}