package observer;

import observer.interfaces.Observer;
import observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private int temperate;
    private int humidity;
    private int pressure;

    public WeatherData(){
    }

    @Override
    public void notifyObservers() {
        observers.forEach((observer) ->{observer.update(temperate, humidity, pressure);} );
    }

    @Override
    public void registerObservers(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObservers(Observer observer) {
        observers.remove(observer);
    }

    public void update(int temperate, int humidity, int pressure){
        this.temperate = temperate;
        this.humidity = humidity;
        this.pressure = pressure;
        System.out.println("subject update");
        notifyObservers();
    }
}
