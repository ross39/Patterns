package observer.ObserverPattern;

import java.util.*;

public class Subject {
    /**
     * Note that observers have been depreciated since java 9 for a number of
     * reasons
     * 1. Not serializable
     * 2. Not thread safe
     * 3. Less to offer
     * 
     * Use listeners instead
     */

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
