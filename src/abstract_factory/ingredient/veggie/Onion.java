package abstract_factory.ingredient.veggie;

public class Onion implements IVeggie{
    @Override
    public String getName() {
        return "Onion";
    }

    @Override
    public String getType() {
        return "Vegetable";
    }
}
