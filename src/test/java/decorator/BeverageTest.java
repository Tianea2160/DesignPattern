package decorator;

import decorator.coffee.Americano;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/*
객체에 추가 요소를 더하는 것에 열려있는 패턴입니다.
하나의 기본 객체를 추기 기능 래퍼 클래스로 감싸면서 구현되는 패턴으로 동적으로 기능을 추가할 수 있다는 점이 가장 큰 특징입니다.

데코레이터 패턴은 언제 사용해야할까?
- 음식에 추가 메뉴나 구성품과 같이 여러 부수적인 기능을 추가하거나 빼야할 때
- 서브 기능들이 많아서 하나의 슈퍼 클래스로 구현하기 어려울 때(예를 들면 입출력의 다양한 형태)

객체지향적인 특징
- 데코레이터 클래스를 추가 하는 것으로 쉽게 기능을 확장 할 수 있다.(확장에 열려있다.)
- 동적으로 기능을 관리 할 수 있다.(유연한 대처가 가능하다.)
- 인터페이스를 따라서 구현된다.
 */
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