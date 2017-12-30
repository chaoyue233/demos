package chaoyue.headFirst.designPattert.decorate;

/**
 * 混合咖啡 饮料实现
 */
public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "HouseBlend";
  }

  public double cost() {
    return 0.89;
  }
}
