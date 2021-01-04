package com.hz;

import java.util.ArrayList;

public class Publisher {

    private ArrayList<Observer> observers;

    protected String currentTopic;

    public Publisher() {
        this.observers = new ArrayList<>();
    }

    public void subscribe(Observer obs) {
        this.observers.add(obs);
    }

    public void unsubscribe(Observer obs) {
        this.observers.remove(obs);
    }

    public void notifyObservers() {

        for(Observer obs : this.observers) {
            obs.update(this.currentTopic);
        }
    }
}
