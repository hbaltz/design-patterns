package template_method.beverage.caffeine.coffee;

import template_method.beverage.caffeine.CaffeineBeverage;

/**
 * Modeled a filter coffee with sugar and milk
 */
public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
