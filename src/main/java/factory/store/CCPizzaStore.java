package factory.store;

import factory.PizzaStore;
import factory.pizza.*;

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
