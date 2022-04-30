package factory.ver2;

import factory.ver2.store.NYPizzaStore;
import org.junit.jupiter.api.Test;

class PizzaTest {
    @Test
    void 치즈피자_생성하기() throws Exception{
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza);
    }
}