package factory.pizza.nystyle;

import factory.pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "NY pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara sauce";

        toppingList.add("Pepperoni");
        toppingList.add("Red pepper");
    }
}
