package factory.store;

import factory.pizza.Pizza;
import factory.pizza.chicagostyle.*;


/**
 * Modeled a store that sells pizza with the chicago style
 */
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            default -> null;
        };
    }
}
