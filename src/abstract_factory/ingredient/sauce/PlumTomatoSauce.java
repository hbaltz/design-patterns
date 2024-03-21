package abstract_factory.ingredient.sauce;

public class PlumTomatoSauce implements ISauce{
    @Override
    public String getName() {
        return "Plum tomato sauce";
    }

    @Override
    public String getType() {
        return "A rich and flavorful tomato sauce";
    }

    @Override
    public int getSpicinessLevel() {
        return 2;
    }
}
