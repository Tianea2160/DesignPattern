package factory.ver2.pizzaes;

import factory.ver2.Pizza;
import factory.ver2.PizzaIngredientFactory;
import factory.ver2.ingredient.Clams;
import factory.ver2.ingredient.Dough;
import factory.ver2.ingredient.Sauce;

public class ClamPizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        Dough dough = ingredientFactory.createDough();
        Sauce sauce = ingredientFactory.createSauce();
        Clams clams = ingredientFactory.createClams();
    }
}
