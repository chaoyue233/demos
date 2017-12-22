package chaoyue.designPattert.observer;

public class WeatherStation {
  public static void main(String[] args) throws InterruptedException {
    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
    weatherData.setMeasurements(11,22,33);
//    Thread.sleep(1000);
    weatherData.setMeasurements(44,55,66);
    currentConditionsDisplay.getObservable().deleteObserver(currentConditionsDisplay);
    Thread.sleep(1000);
    System.out.println("data changed");
    weatherData.setMeasurements(44,55,66);
  }
}
