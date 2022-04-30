package factory.ver1;

import factory.ver1.pizza.CheesePizza;
import factory.ver1.pizza.ClamPizza;
import factory.ver1.pizza.Pizza;
import factory.ver1.pizza.StrangePizza;

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
