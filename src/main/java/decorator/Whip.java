package decorator;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.05;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }
}
