package chaoyue.headFirst.designPattert.singleton;

/**
 * 高效率线程安全单利模式
 * 使用volatile关键字会强制将修改的值立即写入主存
 * 即保证getInstance方法中的 uniqueInstance == null 判断即时性
 */
public class Singleton3 {
  private volatile static Singleton3 uniqueInstance;

  private Singleton3() {
  }

  public static Singleton3 getInstance() {
    if (uniqueInstance == null) {
      synchronized (Singleton3.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new Singleton3();
        }
      }
    }
    return uniqueInstance;
  }
}
