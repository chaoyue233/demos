package chaoyue.headFirst.designPattert.observer;

/**
 * 观察者模式demo
 * 观察者可以订阅主题 主题一旦产生变化 会推送给订阅了主体的观察者
 * java.util.Observer有关于Observer模式的相关实现
 */
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
