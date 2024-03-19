package decorator.beverage;

public class DarkRoast implements IBeverage {

    @Override
    public double cost() {
        return .99;
    }

    @Override
    public String description() {
        return "Join the dark side, take a dark roast coffee";
    }
}
