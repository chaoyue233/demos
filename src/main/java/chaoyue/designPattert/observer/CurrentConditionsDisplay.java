package chaoyue.designPattert.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观测者对象 订阅了WeatherData主题 如果WeatherData数据发生变动 会调当前对象update方法 更新数据内容
 */

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private Observable observable;

  public CurrentConditionsDisplay(Observable observable) {
    this.observable = observable;
    this.observable.addObserver(this);
  }

  public void display() {
    System.out.println(String.format("CurrentConditions: temperature %s ,humidity %s ", temperature, humidity));
  }

  public void update(Observable o, Object arg) {
    if(o instanceof WeatherData){
      WeatherData weatherData = (WeatherData)o;
      this.temperature = weatherData.getTemperature();
      this.humidity = weatherData.getHumidity();
      display();
    }
  }

  public Observable getObservable() {
    return observable;
  }
}
