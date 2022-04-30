package factory.ver2;


import factory.ver2.ingredient.*;

public interface PizzaIngredientFactory{
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPeperoni();
    Clams createClams();
}