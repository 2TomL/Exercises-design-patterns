package be.intecbrussel.Deel2.ObserverPattern;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(Product product);
}
