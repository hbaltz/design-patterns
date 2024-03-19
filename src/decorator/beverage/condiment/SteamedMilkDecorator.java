package decorator.beverage.condiment;

import decorator.beverage.IBeverage;

public class SteamedMilkDecorator implements ICondimentDecorator {
    IBeverage beverage;
    public SteamedMilkDecorator(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .1;
    }

    @Override
    public String description() {
        return beverage.description() + ", Steamed Milk";
    }
}
