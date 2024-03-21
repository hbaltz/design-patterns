package abstract_factory.ingredient.sauce;

/**
 * Modeled a pizza sauce
 */
public interface ISauce {
    /**
     * @return the name of the sauce
     */
    public String getName();

    /**
     * @return the type of the sauce
     */
    public String getType();

    /**
     * @return the spiciness level (1-not spicy, 5-very very spicy)
     */
    public int getSpicinessLevel();
}
