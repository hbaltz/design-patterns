package abstract_factory.ingredient.pepperoni;

/**
 * Modeled a pepperoni
 */
public interface IPepperoni {
    /**
     * @return the name of the pepperoni
     */
    public String getName();

    /**
     * @return the spiciness level (1-not spicy, 5-very very spicy)
     */
    public int getSpicinessLevel();
}
