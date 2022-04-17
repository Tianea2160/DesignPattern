package decorator.coffee;

import decorator.Beverage;

public class Americano extends Beverage {
    public Americano() {
        this.description = "아메리카노";
    }

    @Override
    public double cost() {
        return 2.50;
    }
}
