package chaoyue.headFirst.designPattert.strategy;

/**
 * 鸣叫行为实现 正常叫
 */
public class Quack implements QuackBehavior {
  public void quack() {
    System.out.println("Quack");
  }
}
