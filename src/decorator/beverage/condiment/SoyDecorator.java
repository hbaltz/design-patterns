package decorator.beverage.condiment;

import decorator.beverage.IBeverage;

public class SoyDecorator implements ICondimentDecorator {
    IBeverage beverage;
    public SoyDecorator(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }

    @Override
    public String description() {
        return beverage.description() + ", Soy";
    }
}

