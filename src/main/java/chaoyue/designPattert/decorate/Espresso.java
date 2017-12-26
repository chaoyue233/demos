package chaoyue.designPattert.decorate;

/**
 * 浓缩咖啡 饮料实现
 */
public class Espresso extends Beverage{
  public Espresso() {
    description = "Espresso";
  }

  public double cost() {
    return 1.99;
  }
}
