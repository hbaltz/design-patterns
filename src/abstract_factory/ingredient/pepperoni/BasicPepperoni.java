package abstract_factory.ingredient.pepperoni;

public class BasicPepperoni implements IPepperoni{
    @Override
    public String getName() {
        return "Basic pepperoni";
    }

    @Override
    public int getSpicinessLevel() {
        return 1;
    }
}
