package decorator;

import decorator.beverage.*;
import decorator.beverage.condiment.MochaDecorator;
import decorator.beverage.condiment.SoyDecorator;
import decorator.beverage.condiment.SteamedMilkDecorator;
import decorator.beverage.condiment.WhipDecorator;

public class StarBuzzCoffee {

    public static void main(String[] args) {
        IBeverage beverage = new Espresso();
        System.out.println(beverage.description() + ": $" + beverage.cost());

        IBeverage beverage2 = new DarkRoast();
        beverage2 = new MochaDecorator(beverage2);
        beverage2 = new MochaDecorator(beverage2);
        beverage2 = new WhipDecorator(beverage2);
        System.out.println(beverage2.description() + ": $" + beverage2.cost());

        IBeverage beverage3 = new Decaf();
        beverage3 = new SoyDecorator(beverage3);
        beverage3 = new SteamedMilkDecorator(beverage3);
        beverage3 = new WhipDecorator(beverage3);
        System.out.println(beverage3.description() + ": $" + beverage3.cost());

        IBeverage beverage4 = new HouseBlend();
        beverage4 = new SteamedMilkDecorator(beverage4);
        beverage4 = new SteamedMilkDecorator(beverage4);
        beverage4 = new SteamedMilkDecorator(beverage4);
        System.out.println(beverage4.description() + ": $" + beverage4.cost());
    }
}
