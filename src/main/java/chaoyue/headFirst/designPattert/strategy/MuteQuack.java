package chaoyue.headFirst.designPattert.strategy;

/**
 * 鸣叫行为具体实现 懒得叫
 */

public class MuteQuack implements QuackBehavior {
  public void quack() {
    System.out.println("<Silence>");
  }
}
