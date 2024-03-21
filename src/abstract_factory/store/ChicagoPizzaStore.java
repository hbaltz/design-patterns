package abstract_factory.store;

import abstract_factory.ingredient.ChicagoPizzaIngredientFactory;
import abstract_factory.ingredient.IPizzaIngredientFactory;
import abstract_factory.pizza.CheesePizza;
import abstract_factory.pizza.PepperoniPizza;
import abstract_factory.pizza.Pizza;
import abstract_factory.pizza.VeggiePizza;


/**
 * Modeled a store that sells pizza with the chicago style
 */
public class ChicagoPizzaStore  extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        IPizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

        switch (type) {
            case "cheese" -> {
                pizza = new CheesePizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
            }
            case "veggie" -> {
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
            }
            case "pepperoni" -> {
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("ChicagoStyle Pepperoni Pizza");
            }
        }

        return pizza;
    }
}
