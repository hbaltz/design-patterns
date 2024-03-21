package abstract_factory.pizza;

import abstract_factory.ingredient.IPizzaIngredientFactory;

public class VeggiePizza extends Pizza{
    private final IPizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(IPizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        veggies = pizzaIngredientFactory.createVeggies();
    }
}
