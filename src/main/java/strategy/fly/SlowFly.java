package strategy.fly;

public class SlowFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("slow fly");
    }
}
