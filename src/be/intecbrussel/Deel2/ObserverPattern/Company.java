package be.intecbrussel.Deel2.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Product product) {
        for (Observer observer : observers) {
            observer.update(product);
        }
    }

    public void createNewProduct(String productName) {
        Product product = new Product(productName);
        notifyObservers(product);
    }
}
