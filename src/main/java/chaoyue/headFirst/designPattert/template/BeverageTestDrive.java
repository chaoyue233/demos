package chaoyue.headFirst.designPattert.template;

public class BeverageTestDrive {
  public static void main(String[] args) {
    Tea tea = new Tea();
    Coffee coffee = new Coffee();
    CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

    System.out.println("----tea----");
    tea.prepareRecipe();
    System.out.println("----coffee----");
    coffee.prepareRecipe();
    System.out.println("----coffee without milk----");
    coffeeWithHook.prepareRecipe();
  }
}
