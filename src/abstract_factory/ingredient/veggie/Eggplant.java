package abstract_factory.ingredient.veggie;

public class Eggplant implements IVeggie{
    @Override
    public String getName() {
        return "Eggplant";
    }

    @Override
    public String getType() {
        return "Vegetable";
    }
}
