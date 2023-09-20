package org.behavioralPatterns.Observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Channel {

    private String name;
    private List<ConcreteSubscriber> subs = new ArrayList<>();

    public Channel(String name) {
        this.name = name;
    }


    public List<ConcreteSubscriber> getSubs() {
        return subs;
    }

    public void setSubs(List<ConcreteSubscriber> subs) {
        this.subs = subs;
    }

    public void subscribe(ConcreteSubscriber... subscribers) {
        subs.addAll(Arrays.asList(subscribers));
    }

    public void unsubscribe(ConcreteSubscriber... subscribers) {
        subs.removeAll(Arrays.asList(subscribers));
    }

    public void notifySubscribers(String desc){
        for (ConcreteSubscriber s: subs){
            s.update(desc, this.name);
        }
    }

}
