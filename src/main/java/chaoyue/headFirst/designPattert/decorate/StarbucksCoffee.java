package chaoyue.headFirst.designPattert.decorate;

/**
 * 装饰着模式demo
 * 装饰着可以在所委托被装饰者的行为之前/之后，加上自己的行为，以达到特定的目的
 */
public class StarbucksCoffee {
  public static void main(String[] args) {
    // 来一杯浓缩咖啡
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " cost : "+ beverage.cost());
    // 来一杯浓缩咖啡 加双份摩卡 一份奶泡
    Beverage beverage1 = new Espresso();
    beverage1 = new Mocha(beverage1);
    beverage1 = new Mocha(beverage1);
    beverage1 = new Whip(beverage1);
    System.out.println(beverage1.getDescription() + " cost : "+ beverage1.cost());
    // 来一杯混合咖啡 配料全加
    Beverage beverage2 = new HouseBlend();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Soy(beverage2);
    beverage2 = new Whip(beverage2);
    System.out.println(beverage2.getDescription() + " cost : "+ beverage2.cost());
  }
}
