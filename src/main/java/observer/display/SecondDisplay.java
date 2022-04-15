package observer.display;

import observer.WeatherData;
import observer.interfaces.DisplayElement;
import observer.interfaces.Observer;

public class SecondDisplay implements Observer, DisplayElement {
    private int temperate;
    private int humidity;
    private int pressure;
    private WeatherData weatherData;

    public SecondDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObservers(this);
    }

    @Override
    public void update(int temperate, int humidity, int pressure) {
        this.temperate = temperate;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "SecondDisplay{" +
                "temperate=" + temperate +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
