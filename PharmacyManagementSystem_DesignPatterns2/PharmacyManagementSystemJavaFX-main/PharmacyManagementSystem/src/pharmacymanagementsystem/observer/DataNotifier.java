package pharmacymanagementsystem.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * DataNotifier acts as the Subject that notifies all registered Observers of updates.
 */
public class DataNotifier implements Subject {

    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
