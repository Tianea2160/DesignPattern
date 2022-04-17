package decorator;

import decorator.coffee.Americano;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BeverageTest {
    @Test
    void 데코레이터_패턴_구현_및_실행() throws Exception{
        Beverage beverage = new Americano();

        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());

        beverage = new Whip(beverage);
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);

        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
    }
}