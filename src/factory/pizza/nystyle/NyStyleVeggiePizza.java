package factory.pizza.nystyle;

import factory.pizza.Pizza;

public class NyStyleVeggiePizza extends Pizza {
    public NyStyleVeggiePizza() {
        name = "Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara sauce";

        toppingList.add("Eggplant");
        toppingList.add("Mushrooms");
        toppingList.add("Tomatoes");
        toppingList.add("Red pepper");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 35 min at 180°C");
    }
}
