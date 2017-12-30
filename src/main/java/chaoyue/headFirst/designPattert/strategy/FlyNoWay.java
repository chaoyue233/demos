package chaoyue.headFirst.designPattert.strategy;

/**
 * 飞行行为具体实现 懒得飞
 */
public class FlyNoWay implements FlyBehavior {
  public void fly() {
    System.out.println("fly no way");
  }
}
