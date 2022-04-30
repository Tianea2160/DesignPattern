package factory.ver1.pizza;

public class ApplePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("prepare");
    }

    @Override
    public void cut() {
        System.out.println("cut");
    }

    @Override
    public void bake() {
        System.out.println("bake");
    }

    @Override
    public void box() {
        System.out.println("box");
    }
}
