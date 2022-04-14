package strategy;

import strategy.fly.FastFly;
import strategy.quack.NotQuack;

public class SpecialDuck extends Duck{
    public SpecialDuck() {
        // 빠르게 날지만 짖지는 않는 오리가 만들어 진다.
        this.flyBehavior = new FastFly();
        this.quackBehavior = new NotQuack();
    }
}
