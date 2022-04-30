package factory.ver1.pizza;

public class StrangePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("strange");
    }

    @Override
    public void cut() {
        System.out.println("strange");
    }

    @Override
    public void bake() {
        System.out.println("strange");
    }

    @Override
    public void box() {
        System.out.println("strange");
    }
}
