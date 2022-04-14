package strategy.fly;

public class NotFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("not fly");
    }
}
