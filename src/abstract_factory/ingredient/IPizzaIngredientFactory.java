package abstract_factory.ingredient;

import abstract_factory.ingredient.cheese.ICheese;
import abstract_factory.ingredient.dough.IDough;
import abstract_factory.ingredient.pepperoni.IPepperoni;
import abstract_factory.ingredient.sauce.ISauce;
import abstract_factory.ingredient.veggie.IVeggie;

/**
 * A factory for the ingredients of a pizza
 */
public interface IPizzaIngredientFactory {

    /**
     * @return the dough of the pizza
     */
    public IDough createDough();

    /**
     * @return the sauce of the pizza
     */
    public ISauce createSauce();

    /**
     * @return the cheese used on the pizza
     */
    public ICheese createCheese();

    /**
     * @return the list of veggie topping
     */
    public IVeggie[] createVeggies();

    /**
     * @return the pepperoni used on the pizza
     */
    public IPepperoni createPepperoni();
}
