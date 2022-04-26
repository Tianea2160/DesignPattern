package factory.store;

import factory.PizzaFactory;
import factory.PizzaStore;
import factory.pizza.ApplePizza;
import factory.pizza.ClamPizza;
import factory.pizza.Pizza;
import factory.pizza.StrangePizza;

public class AAPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("apple"))
            pizza = new ApplePizza();
        else if (type.equals("clam"))
            pizza = new ClamPizza();
        else
            pizza = new StrangePizza();
        return pizza;
    }
}
