package chaoyue.designPattert.decorate;

/**
 * 摩卡 配料实现 使用配料装饰基类
 * 摩卡是一个装饰着 装饰着必须能够完全代替被装饰的对象
 */
public class Mocha extends CondimentDecoraotr {
  Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + " , Mocha";
  }

  public double cost() {
    return 0.2 + beverage.cost();
  }
}
