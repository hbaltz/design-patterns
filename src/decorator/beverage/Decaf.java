package decorator.beverage;

public class Decaf implements IBeverage{
    @Override
    public double cost() {
        return 1.05;
    }

    @Override
    public String description() {
        return "Stay calm, drink decaf";
    }
}
