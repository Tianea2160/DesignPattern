package factory.ver2.pizzafactories;

import factory.ver2.Pizza;
import factory.ver2.PizzaIngredientFactory;
import factory.ver2.ingredient.*;
import factory.ver2.pizzaes.CheesePizza;
import factory.ver2.pizzafactories.NYingredient.*;

public class NewYorkPizzaFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Onion(), new Garlic(), new RedPepper()};
    }

    @Override
    public Pepperoni createPeperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
