package chaoyue.headFirst.designPattert.singleton;

/**
 * 另外一种单例实现方式
 */
public class Singleton2 {
  private Singleton2() {
  }
  private static Singleton2 singleton2 = new Singleton2();

  public static Singleton2 getInstance(){
    return singleton2;
  }
}
