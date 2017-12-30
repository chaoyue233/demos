package chaoyue.headFirst.designPattert.strategy;

/**
 * 鸭子类具体实现 野鸭
 */

public class MallardDuck extends Duck{
  public MallardDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  public void display(){
    System.out.println("i am a mallard duck");
  }
}
