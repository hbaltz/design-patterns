package abstract_factory.ingredient.pepperoni;

public class HotPepperoni implements IPepperoni{
    @Override
    public String getName() {
        return "Hot pepperoni";
    }

    @Override
    public int getSpicinessLevel() {
        return 4;
    }
}
