package abstract_factory.pizza.chicagostyle;

import abstract_factory.pizza.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato sauce";

        toppingList.add("Mushrooms");
        toppingList.add("Tomatoes");
        toppingList.add("Zucchini");
        toppingList.add("Broccoli");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 40 min at 160°C");
    }
}
