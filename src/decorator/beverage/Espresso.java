package decorator.beverage;

public class Espresso implements IBeverage{
    @Override
    public double cost() {
        return 1.99;
    }

    @Override
    public String description() {
        return "An excellent espresso!";
    }
}
