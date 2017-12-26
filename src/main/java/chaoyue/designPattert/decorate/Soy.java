package chaoyue.designPattert.decorate;

/**
 * 大豆 配料实现 同 Mocha
 */
public class Soy extends CondimentDecoraotr{
  Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + " , Soy";
  }

  public double cost() {
    return 0.3 + beverage.cost();
  }
}
