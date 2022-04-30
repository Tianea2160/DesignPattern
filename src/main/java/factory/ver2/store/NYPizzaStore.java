package factory.ver2.store;

import factory.ver2.Pizza;
import factory.ver2.PizzaStore;
import factory.ver2.pizzaes.CheesePizza;
import factory.ver2.pizzaes.ClamPizza;
import factory.ver2.pizzafactories.NewYorkPizzaFactory;

public class NYPizzaStore implements PizzaStore {
    private final NewYorkPizzaFactory newYorkPizzaFactory = new NewYorkPizzaFactory();

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheesePizza(newYorkPizzaFactory);
            pizza.setName("cheesePizza");
        }else if(type.equals("clams")){
            pizza = new ClamPizza(newYorkPizzaFactory);
            pizza.setName("clamsPizza");
        }
        return pizza;
    }

    @Override
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
