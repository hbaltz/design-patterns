package factory;

import factory.pizza.IPizza;
import factory.pizza.factory.SimplePizzaFactory;

public class PizzaStore {

    SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }
    public IPizza orderPizza(String type) {
        // This object could be null, we could use the Null Object Pattern to avoid an if test
        IPizza pizza = simplePizzaFactory.createPizza(type);

        // this if
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

        return pizza;
    }
}
