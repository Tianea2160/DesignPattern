package strategy.quack;

public class NotQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("not quack");
    }
}
