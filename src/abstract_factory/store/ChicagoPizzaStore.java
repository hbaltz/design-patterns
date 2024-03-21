package abstract_factory.store;

import abstract_factory.pizza.Pizza;
import abstract_factory.pizza.chicagostyle.ChicagoStyleCheesePizza;
import abstract_factory.pizza.chicagostyle.ChicagoStylePepperoniPizza;
import abstract_factory.pizza.chicagostyle.ChicagoStyleVeggiePizza;
import abstract_factory.store.PizzaStore;


/**
 * Modeled a store that sells pizza with the chicago style
 */
public class ChicagoPizzaStore extends PizzaStore {
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
