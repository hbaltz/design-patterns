package abstract_factory.ingredient.veggie;

public class RedPepper implements IVeggie{
    @Override
    public String getName() {
        return "RedPepper";
    }

    @Override
    public String getType() {
        return "Vegetable";
    }
}
