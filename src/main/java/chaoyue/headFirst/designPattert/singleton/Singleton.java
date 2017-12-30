package chaoyue.headFirst.designPattert.singleton;

/**
 * 单例模式 demo
 */
public class Singleton {
  private static Singleton uniqueInstance;

  // 初始化构造器 防止被其他类初始化
  private Singleton() {
  }

  // synchronized 保证多线程之间安全问题
  public static synchronized Singleton getInstqance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }

}
