package chaoyue.designPattert.factory.store;

import chaoyue.designPattert.factory.SimplePizzaFactory;
import chaoyue.designPattert.factory.pizza.NYStyleCheesePizza;
import chaoyue.designPattert.factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

  Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new NYStyleCheesePizza();
    }
    return null;
  }
}
