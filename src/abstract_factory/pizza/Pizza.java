package abstract_factory.pizza;

import abstract_factory.ingredient.cheese.ICheese;
import abstract_factory.ingredient.dough.IDough;
import abstract_factory.ingredient.pepperoni.IPepperoni;
import abstract_factory.ingredient.sauce.ISauce;
import abstract_factory.ingredient.veggie.IVeggie;

/**
 * Modeled a pizza
 */
public abstract class Pizza {
    protected String name;
    protected IDough dough;
    protected ISauce sauce;
    protected IVeggie veggies[];
    protected ICheese cheese;
    protected IPepperoni pepperoni;

    /**
     * Specific preparation method
     */
    abstract public void prepare();

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

    /**
     * @return the name of the pizza
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the new name of the pizza
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Display a description of the pizza
     */
    public void displayDescription() {
        System.out.println("Pizza: " + name);
        if (dough != null) {
           System.out.println("Dough: " + dough.getType());
           System.out.println("Dough thickness: " + dough.getThickness() + "inch");
        }

        if (sauce != null) {
            System.out.println("Sauce: " + sauce.getName() + ", " + sauce.getType());
        }

        if (veggies != null && veggies.length != 0) {
            System.out.println("Veggies list: ");
            for (IVeggie veggie : veggies) {
                System.out.println("*  " + veggie.getName());
            }
        }

        if(pepperoni != null) {
            System.out.println("Pepperoni: " + pepperoni.getName());
        }

        if(cheese != null) {
            System.out.println("Cheese :" + cheese.getName());
        }
    }
}
