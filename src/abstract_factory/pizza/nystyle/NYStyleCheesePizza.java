package abstract_factory.pizza.nystyle;

import abstract_factory.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara sauce";

        toppingList.add("Grated Reggiano Cheese");
    }
}
