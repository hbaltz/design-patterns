package template_method.beverage.caffeine.tea;

import template_method.beverage.caffeine.CaffeineBeverage;

/**
 * Modeled a tea beverage with lemon
 */
public class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
