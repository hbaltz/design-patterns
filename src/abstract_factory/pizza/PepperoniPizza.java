package abstract_factory.pizza;

import abstract_factory.ingredient.IPizzaIngredientFactory;

public class PepperoniPizza extends Pizza{
    private final IPizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(IPizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        pepperoni = pizzaIngredientFactory.createPepperoni();
    }
}
