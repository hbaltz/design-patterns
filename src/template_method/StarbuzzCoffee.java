package template_method;

import template_method.beverage.caffeine.coffee.Coffee;
import template_method.beverage.caffeine.tea.Tea;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        // Prepare tea and coffee using the template method pattern
        // (the method in this case is prepareRecipe in caffeineBeverage)
        Tea tea = new Tea();
        tea.prepareRecipe();

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
