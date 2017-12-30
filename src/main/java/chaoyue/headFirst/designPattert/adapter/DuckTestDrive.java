package chaoyue.headFirst.designPattert.adapter;

/**
 * 适配器模式demo 火鸡强行假装成鸭子
 */
public class DuckTestDrive {
  public static void main(String[] args) {
    MallardDuck mallardDuck = new MallardDuck();
    WildTurkey turkey = new WildTurkey();
    Duck turkeyAdapter = new TurkeyAdapter(turkey);

    turkey.fly();
    turkey.gobble();

    testDuck(mallardDuck);
    testDuck(turkeyAdapter);

  }

  private static void testDuck(Duck duck) {
    duck.quack();
    duck.fly();
  }
}
