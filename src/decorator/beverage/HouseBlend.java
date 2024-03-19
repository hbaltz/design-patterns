package decorator.beverage;

public class HouseBlend implements IBeverage{
    @Override
    public double cost() {
        return .89;
    }

    @Override
    public String description() {
        return "Made home: the house blend coffee!";
    }
}
