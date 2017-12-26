package chaoyue.designPattert.factory.store;

import chaoyue.designPattert.factory.pizza.ChicagoStyleCheesePizza;
import chaoyue.designPattert.factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    if (type.equals("cheese")) {
      return new ChicagoStyleCheesePizza();
    }
    return null;
  }
}
