package abstract_factory.store;

import abstract_factory.ingredient.IPizzaIngredientFactory;
import abstract_factory.ingredient.NYPizzaIngredientFactory;
import abstract_factory.pizza.CheesePizza;
import abstract_factory.pizza.PepperoniPizza;
import abstract_factory.pizza.Pizza;
import abstract_factory.pizza.VeggiePizza;

/**
 * Modeled a store that sells pizza with the NY style
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        IPizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        switch (type) {
            case "cheese" -> {
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("New York Style Veggie Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
            }
        }

        return pizza;
    }
}
