package abstract_factory.ingredient;

import abstract_factory.ingredient.cheese.ICheese;
import abstract_factory.ingredient.cheese.MozzarelaCheese;
import abstract_factory.ingredient.dough.IDough;
import abstract_factory.ingredient.dough.ThickCrustDough;
import abstract_factory.ingredient.pepperoni.HotPepperoni;
import abstract_factory.ingredient.pepperoni.IPepperoni;
import abstract_factory.ingredient.sauce.ISauce;
import abstract_factory.ingredient.sauce.PlumTomatoSauce;
import abstract_factory.ingredient.veggie.IVeggie;
import abstract_factory.ingredient.veggie.Mushroom;
import abstract_factory.ingredient.veggie.Onion;
import abstract_factory.ingredient.veggie.RedPepper;

public class ChicagoPizzaIngredientFactory implements IPizzaIngredientFactory {
    @Override
    public IDough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public ISauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public ICheese createCheese() {
        return new MozzarelaCheese();
    }

    @Override
    public IVeggie[] createVeggies() {
        return new IVeggie[] { new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public IPepperoni createPepperoni() {
        return new HotPepperoni();
    }
}
