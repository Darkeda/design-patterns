package Observer;

import java.util.ArrayList;
import java.util.List;

public class OwnerOfCompany implements Subject {
    private List<Observer> observers;
    private String message;

    public OwnerOfCompany() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void addObserver(Observer observer) {
        observer.setSubject(this);
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update();
        }
    }

    public void setMessage(String string) {
        message = string;
        notifyObservers();
    }

    @Override
    public String getUpdate() {
        return message;
    }
}
