package factory;

import factory.store.ChicagoPizzaStore;
import factory.store.NYPizzaStore;
import factory.store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nystore = new NYPizzaStore();
        PizzaStore chicagostore = new ChicagoPizzaStore();

        nystore.orderPizza("cheese");
        chicagostore.orderPizza("veggie");
    }
}
