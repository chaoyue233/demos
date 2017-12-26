package chaoyue.designPattert.factory.store;

import chaoyue.designPattert.factory.SimplePizzaFactory;
import chaoyue.designPattert.factory.pizza.Pizza;

import java.util.ArrayList;


public abstract class PizzaStore {

  // 简单工厂方法实现
//  SimplePizzaFactory factory;
//
//  public PizzaStore(SimplePizzaFactory factory) {
//    this.factory = factory;
//  }

  public Pizza orderPizza(String type) {
//    Pizza pizza = factory.createPizza(type);
    Pizza pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

  abstract Pizza createPizza(String type);
}
