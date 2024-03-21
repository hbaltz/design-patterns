package abstract_factory.pizza;

import java.util.ArrayList;

/**
 * Modeled a pizza
 */
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppingList = new ArrayList<>();

    /**
     * Specific preparation method
     */
    public void prepare() {
        System.out.println("Preparing: " + name);
        System.out.println("Tossing " + dough + "...");
        System.out.println("Adding " + sauce + "...");
        System.out.println("Adding toppings: ");
        for(String topping : toppingList) {
            System.out.println("*  " + topping);
        }
    }

    /**
     * Specific bake method
     */
    public void bake() {
        System.out.println("Bake for 25 min at 200°C");
    }

    /**
     * Specific cut method
     */
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    /**
     * Specific box method
     */
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
}
