package decorator.beverage.condiment;

import decorator.beverage.IBeverage;

public class WhipDecorator implements ICondimentDecorator {
    IBeverage beverage;
    public WhipDecorator(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .1;
    }

    @Override
    public String description() {
        return beverage.description() + ", Whip";
    }
}

