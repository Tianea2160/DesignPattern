package factory.ver1.store;

import factory.ver1.PizzaStore;
import factory.ver1.pizza.ApplePizza;
import factory.ver1.pizza.ClamPizza;
import factory.ver1.pizza.Pizza;
import factory.ver1.pizza.StrangePizza;

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
