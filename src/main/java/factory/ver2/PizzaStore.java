package factory.ver2;

public interface PizzaStore {
    Pizza createPizza(String type);
    Pizza orderPizza(String type);
}
