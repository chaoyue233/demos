package chaoyue.designPattert.observer;

/**
 * 尝试自己手动实现的主体类
 */

public interface Subject {
  void register(Observer o);
  void remove(Observer o);
  void notifyObservers();
}
