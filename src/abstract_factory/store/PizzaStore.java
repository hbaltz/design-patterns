package abstract_factory.store;

import abstract_factory.pizza.Pizza;

/**
 * Modeled a pizza store
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }


    /**
     * This si a factory method
     *
     * @param type the type of pizza we want to create
     * @return a created pizza regarding the type
     */
    protected abstract Pizza createPizza(String type);
}
