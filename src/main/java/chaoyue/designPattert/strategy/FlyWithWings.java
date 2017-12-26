package chaoyue.designPattert.strategy;

/**
 * 飞行行为具体实现 用翅膀飞
 */
public class FlyWithWings implements FlyBehavior {
  public void fly() {
    System.out.println("Fly with wings");
  }
}
