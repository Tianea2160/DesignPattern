package decorator;

public abstract class Beverage {
    protected String description = "no title";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
