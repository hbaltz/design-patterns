package abstract_factory;

import abstract_factory.store.ChicagoPizzaStore;
import abstract_factory.store.NYPizzaStore;
import abstract_factory.store.PizzaStore;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nystore = new NYPizzaStore();
        PizzaStore chicagostore = new ChicagoPizzaStore();

        nystore.orderPizza("cheese");
        chicagostore.orderPizza("veggie");
    }
}
