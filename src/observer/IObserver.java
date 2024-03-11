package observer;

/**
 * Model an observer in the case of the weather application
 */
public interface IObserver {
    /**
     * The param are the state values the Observers get from the Subject when a weather measurement changes
     * @param temp the temperature in degree Celsius
     * @param humidity the percent of humidity in the air
     * @param pressure the Barometric Pressure in mbar
     */
    public void update(float temp, float humidity, float pressure);
}
