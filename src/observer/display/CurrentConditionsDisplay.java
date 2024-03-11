package observer.display;

import observer.IObserver;
import observer.ISubject;

public class CurrentConditionsDisplay implements IObserver, IDisplayElement {

    /**
     * In degree Celsius
     */
    private float temperature;
    /**
     * In percent of humidity in the air
     */
    private float humidity;
    /**
     * We keep the reference to the subject if we need to un-register the observer
     */
    private final ISubject weatherData;

    public CurrentConditionsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " °C and " + humidity + "% humidity");
    }
}
