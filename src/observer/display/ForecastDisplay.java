package observer.display;

import observer.IObserver;
import observer.ISubject;
import observer.weather.WeatherData;

public class ForecastDisplay implements IObserver, IDisplayElement {

    /**
     * In mbar
     */
    private float currentPressure = 1000;
    /**
     * In mbar
     */
    private float lastPressure;

    /**
     * We keep the reference to the subject if we need to un-register the observer
     */
    private final ISubject weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        String displayedMessage = "Forecast: ";

        if (currentPressure > lastPressure) {
            displayedMessage += "Improving weather on the way!";
        } else if (currentPressure == lastPressure) {
            displayedMessage += "More of the same";
        } else if (currentPressure < lastPressure) {
            displayedMessage += "Watch out for cooler, rainy weather";
        }

        System.out.println(displayedMessage);
    }
}
