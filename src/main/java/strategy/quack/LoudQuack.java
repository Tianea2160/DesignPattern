package strategy.quack;

public class LoudQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("make noise");
    }
}
