package factory;

import factory.pizza.Pizza;
import factory.store.AAPizzaStore;
import factory.store.BBPizzaStore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
객체를 생성할 때 필요한 인터페이스를 만든다.
어떤 클래스의 인스턴스를 만들지는 서브 클래스에서 결정한다.
팩토리 메소드 패턴을 사용하면 클래스 인스턴스 만드는 일을 서브 클래스에게 맡기게 된다.

이를 통해서 여러 지점을 확장하거나 피자의 메뉴를 추가하는 활동을 인터페이스에 맞추어서 클래스를 추가하는 것으로 쉽게 확장이 가능하다.
제품의 생산과 가공 로직을 팩토리 메소드 패턴을 통해서 분리할 수 있다는 점도 하나의 강점이 될 수 있습니다.
 */
class PizzaStoreTest {

    @Test
    void 팩토리_패턴_연습() throws Exception{
        PizzaStore aStore = new AAPizzaStore();
        PizzaStore bStore = new BBPizzaStore();


        Pizza cheesePizza = aStore.orderPizza("cheese");


    }
}