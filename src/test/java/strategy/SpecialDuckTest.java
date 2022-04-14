package strategy;

import org.junit.jupiter.api.Test;
import strategy.fly.SlowFly;
import strategy.quack.LoudQuack;

import static org.junit.jupiter.api.Assertions.*;

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