package strategy;

import org.junit.jupiter.api.Test;
import strategy.fly.SlowFly;
import strategy.quack.LoudQuack;

/*
전략 패턴을 사용한 구현
전략 패턴을 왜 사용해야하는가?
1. 중복되는 코드를 줄여주고 기능의 확장에 열려있다.
2. 상속이 가지는 문제점을 전략 패턴을 통해서 어느정도 극복할 수 있다.
(코드의 중복, 변경이 어려움, 서브 클래스에서 상속 받은 내용을 알기가 힘듬)
언제 사용해야하는가?
1. 상위클래스를 상속하여 객체를 생성할 때 고려해볼만하다.
2. 상위클래스의 인터페이스를 하위 클래스에서 자주 오버라이드 해야하는 메소드와 그렇지 않는 메소드가 혼합되어 있을 때 고려해볼만하다.

전략패턴 요약
변경에는 닫혀있고 확장에는 열려있어야한다는 디자인 패턴 원칙과
인터페이스에 맞게 코드를 작성해야한다는 원칙이 잘 드러나는 패턴으로
자주 변경되는 필드 또는 메소드와 그렇지 않는 메소드를 구분하여 설계함으로써
유지보수에 용이함을 준다.
 */

class SpecialDuckTest {
    @Test
    void 커스텀한_오리의_동작을_확인하고_동작을_변경해본다(){
        SpecialDuck specialDuck = new SpecialDuck();
        specialDuck.performFly();
        specialDuck.performQuack();

        specialDuck.setFlyBehavior(new SlowFly());
        specialDuck.performFly();

        specialDuck.setQuackBehavior(new LoudQuack());
        specialDuck.performQuack();
    }
}