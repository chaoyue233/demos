package chaoyue.designPattert.observer;

/**
 * 自己手动实现的观测者类
 */
public interface Observer {
  void update(float temp,float humidity,float pressure);
}
