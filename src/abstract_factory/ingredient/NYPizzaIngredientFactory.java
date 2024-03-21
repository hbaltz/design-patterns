package abstract_factory.ingredient;

import abstract_factory.ingredient.cheese.ICheese;
import abstract_factory.ingredient.cheese.ReggianoCheese;
import abstract_factory.ingredient.dough.IDough;
import abstract_factory.ingredient.dough.ThinCrustDough;
import abstract_factory.ingredient.pepperoni.BasicPepperoni;
import abstract_factory.ingredient.pepperoni.IPepperoni;
import abstract_factory.ingredient.sauce.ISauce;
import abstract_factory.ingredient.sauce.MarinaraSauce;
import abstract_factory.ingredient.veggie.Eggplant;
import abstract_factory.ingredient.veggie.IVeggie;
import abstract_factory.ingredient.veggie.Mushroom;
import abstract_factory.ingredient.veggie.RedPepper;

public class NYPizzaIngredientFactory implements IPizzaIngredientFactory{
    @Override
    public IDough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public ISauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public ICheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public IVeggie[] createVeggies() {
        return new IVeggie[]{ new Mushroom(), new Eggplant(), new RedPepper() };
    }

    @Override
    public IPepperoni createPepperoni() {
        return new BasicPepperoni();
    }
}
