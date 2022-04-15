package observer.interfaces;

public interface Subject {
    void notifyObservers();
    void registerObservers(Observer observer);
    void removeObservers(Observer observer);
}
