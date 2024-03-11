package observer.weather;

import observer.IObserver;
import observer.ISubject;

import java.util.ArrayList;

public class WeatherData implements ISubject {

    private final ArrayList<IObserver> observerList;
    /**
     * In degree Celsius
     */
    private float temperature;
    /**
     * In percent of humidity in the air
     */
    private float humidity;
    /**
     * In mbar
     */
    private float pressure;

    public WeatherData() {
        observerList = new ArrayList<>();
    }
    @Override
    public void registerObserver(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer : observerList) {
           observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * Called when measurements changed
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * We consider that the measure for the temperature, humidity and pressure are done at the same time
     * So we set them at the same time every time
     *
     * a nice improvement could be to have a ISubject for each measurement
     * another to only call measurementsChanged when the values actually change (next value <> current value)
     * but for the example, we wiil keep that simple
     * @param temperature in degree celsius
     * @param humidity in percent of humidity in the air
     * @param pressure in mbar
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
