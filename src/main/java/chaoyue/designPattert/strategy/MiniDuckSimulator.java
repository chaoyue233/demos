package chaoyue.designPattert.strategy;

/**
 * 小型鸭子模拟器
 * 策略模式Demo 以duck为例子 将可变的行为从duck基类中分离出来 甚至可以再运行时进行动态替换
 */
public class MiniDuckSimulator {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.display();
    mallard.performFly();
    mallard.performQuack();
    mallard.swim();
    // 使用策略模式
    mallard.setFlyBehavior(new FlyNoWay());
    mallard.setQuackBehavior(new MuteQuack());
    mallard.performFly();
    mallard.performQuack();
    mallard.swim();
  }
}
