package factory.ver1.store;

import factory.ver1.PizzaStore;
import factory.ver1.pizza.CheesePizza;
import factory.ver1.pizza.ClamPizza;
import factory.ver1.pizza.Pizza;
import factory.ver1.pizza.StrangePizza;

public class CCPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese"))
            pizza = new CheesePizza();
        else if (type.equals("clam"))
            pizza = new ClamPizza();
        else
            pizza = new StrangePizza();
        return pizza;
    }
}
