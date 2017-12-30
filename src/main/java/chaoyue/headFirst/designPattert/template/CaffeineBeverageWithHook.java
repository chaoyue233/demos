package chaoyue.headFirst.designPattert.template;

public abstract class CaffeineBeverageWithHook {
  // 定义逻辑顺序 不允许子类重写
  final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    // 子类通过重写 customerWantsCondiments 可以实现对主流程的逻辑控制变更
    if (customerWantsCondiments()) {
      addCondiments();
    }
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

  boolean customerWantsCondiments() {
    return true;
  }

}
