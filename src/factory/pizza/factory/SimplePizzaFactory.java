package factory.pizza.factory;

import factory.pizza.*;

/**
 * Manage pizza creation regarding the type of pizza
 *
 * FYI: this is not an implementation of the factory pattern, we will see that later
 */
public class SimplePizzaFactory {

    public IPizza createPizza(String type) {
        IPizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
