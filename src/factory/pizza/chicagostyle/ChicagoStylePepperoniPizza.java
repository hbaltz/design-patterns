package factory.pizza.chicagostyle;

import factory.pizza.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Deep Dish Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato sauce";

        toppingList.add("Pepperoni");
        toppingList.add("Sun-Dried Tomatoes");
    }
}
