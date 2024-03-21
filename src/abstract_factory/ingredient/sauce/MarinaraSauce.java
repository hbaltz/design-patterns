package abstract_factory.ingredient.sauce;

public class MarinaraSauce implements ISauce{
    @Override
    public String getName() {
        return "Marinara sauce";
    }

    @Override
    public String getType() {
        return "A classic Italian tomato sauce";
    }

    @Override
    public int getSpicinessLevel() {
        return 1;
    }
}
