package factory;

import factory.pizza.CheesePizza;
import factory.pizza.ClamPizza;
import factory.pizza.Pizza;
import factory.pizza.StrangePizza;

public class PizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza;
        if ("clam".equals(type)) {
            pizza = new ClamPizza();
        } else if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        }else{
            pizza  = new StrangePizza();
        }
        return pizza;
    }
}
