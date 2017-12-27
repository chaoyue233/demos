package chaoyue.designPattert.template;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
  void brew() {
    System.out.println("dripping coffee through filter");
  }

  void addCondiments() {
    System.out.println("adding sugar and milk");
  }

  public boolean customerWantsCondiments() {
    return false;
  }

}
