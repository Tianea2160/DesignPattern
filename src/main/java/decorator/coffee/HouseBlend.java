package decorator.coffee;

import decorator.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "하우스 블렌드";
    }

    @Override
    public double cost() {
        return .99;
    }
}
