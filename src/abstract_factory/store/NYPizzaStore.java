package abstract_factory.store;

import abstract_factory.pizza.Pizza;
import abstract_factory.pizza.nystyle.*;

/**
 * Modeled a store that sells pizza with the NY style
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            case "veggie" -> new NyStyleVeggiePizza();
            default -> null;
        };
    }
}
