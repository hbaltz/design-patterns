package factory.pizza.nystyle;

import factory.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara sauce";

        toppingList.add("Grated Reggiano Cheese");
    }
}
