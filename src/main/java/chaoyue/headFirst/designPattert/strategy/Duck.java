package chaoyue.headFirst.designPattert.strategy;

/**
 * 鸭子基类
 * 所有鸭子都具有飞行行为和鸣叫行为 抽象出接口方便动态配置
 */

public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void setFlyBehavior(FlyBehavior flyBehavior){
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior){
    this.quackBehavior = quackBehavior;
  }

  public void swim() {
    System.out.println("all duck float");
  }

}
