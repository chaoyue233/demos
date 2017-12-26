package chaoyue.designPattert.decorate;

/**
 * 奶油 配料实现 同 Mocha
 */
public class Whip extends CondimentDecoraotr{
  Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + " , Whip";
  }

  public double cost() {
    return 0.2 + beverage.cost();
  }
}
