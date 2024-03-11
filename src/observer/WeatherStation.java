package observer;

import observer.display.CurrentConditionsDisplay;
import observer.display.ForecastDisplay;
import observer.display.StatisticsDisplay;
import observer.weather.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(22, 65, 1008);
        weatherData.setMeasurements(18, 55, 1024);
        weatherData.setMeasurements(18, 55, 998);

        weatherData.removeObserver(currentConditionsDisplay);

        weatherData.setMeasurements(-1, 90, 1100);

        weatherData.removeObserver(statisticsDisplay);

        weatherData.setMeasurements(35, 5, 1001);

        weatherData.removeObserver(forecastDisplay);
        weatherData.registerObserver(currentConditionsDisplay);

        weatherData.setMeasurements(20, 50, 1000);
    }
}
