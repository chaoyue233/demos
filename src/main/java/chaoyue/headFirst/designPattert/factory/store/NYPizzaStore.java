package chaoyue.headFirst.designPattert.factory.store;

import chaoyue.headFirst.designPattert.factory.pizza.NYStyleCheesePizza;
import chaoyue.headFirst.designPattert.factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

  Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new NYStyleCheesePizza();
    }
    return null;
  }
}
