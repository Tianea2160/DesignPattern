package factory.ver2.pizzaes;

import factory.ver2.Pizza;
import factory.ver2.PizzaIngredientFactory;
import factory.ver2.ingredient.Cheese;
import factory.ver2.ingredient.Dough;
import factory.ver2.ingredient.Sauce;

public class CheesePizza extends Pizza {
    private PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        Dough dough = pizzaIngredientFactory.createDough();
        Sauce sauce = pizzaIngredientFactory.createSauce();
        Cheese cheese = pizzaIngredientFactory.createCheese();
    }

}
