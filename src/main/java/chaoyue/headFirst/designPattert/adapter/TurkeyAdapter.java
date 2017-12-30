package chaoyue.headFirst.designPattert.adapter;

/**
 * 火鸡 --> 鸭子 适配器
 */
public class TurkeyAdapter implements Duck {
  Turkey turkey;

  public TurkeyAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  public void fly() {
    for (int i = 0; i < 5; i++) {
      turkey.fly();
    }
  }

  public void quack() {
    turkey.gobble();
  }
}
