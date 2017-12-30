package chaoyue.headFirst.designPattert.template;

/**
 * 模板方法类 定义咖啡因饮料制作方法
 */
public abstract class CaffeineBeverage {
  // 定义逻辑顺序 不允许子类重写
  final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  // 差异化的地方定义为抽象方法交由子类去实现
  abstract void brew();

  abstract void addCondiments();

  // 公共的方法可以直接实现
  void boilWater() {
    System.out.println("boiling water");
  }

  void pourInCup() {
    System.out.println("pouring into cup");
  }
}
