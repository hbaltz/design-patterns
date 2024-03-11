package observer.display;

import observer.IObserver;
import observer.ISubject;
import observer.weather.WeatherData;

public class StatisticsDisplay implements IObserver, IDisplayElement{

    /**
     * The max temperature in degree Celsius
     */
    private float maxTemp = -200;
    /**
     * The min temperature in degree Celsius
     */
    private float minTemp = 200;
    /**
     * The sum of temperature (used to calculate the average temperature)
     */
    private float tempSum= 0.0f;
    /**
     * The number of reading (used to calculate the average temperature)
     */
    private int numReadings;

    /**
     * We keep the reference to the subject if we need to un-register the observer
     */
    private final ISubject weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp + " °C");
    }
}
