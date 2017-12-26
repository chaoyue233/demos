package chaoyue.designPattert.factory;

import chaoyue.designPattert.factory.pizza.Pizza;
import chaoyue.designPattert.factory.store.ChicagoPizzaStore;
import chaoyue.designPattert.factory.store.NYPizzaStore;
import chaoyue.designPattert.factory.store.PizzaStore;

public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();

    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("van ordered a " + pizza.getName());

    pizza = chicagoStore.orderPizza("cheese");
    System.out.println("chaoyue ordered a " + pizza.getName());
  }
}
