package strategy.fly;

public class FastFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly fast");
    }
}
