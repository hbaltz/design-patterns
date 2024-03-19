package decorator.beverage.condiment;

import decorator.beverage.IBeverage;

public class MochaDecorator implements ICondimentDecorator {
    IBeverage beverage;

    public MochaDecorator(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .2;
    }

    @Override
    public String description() {
        return beverage.description() + ", Mocha";
    }
}
